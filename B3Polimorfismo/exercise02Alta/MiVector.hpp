#pragma once
#include "Contenedor.hpp"
#include <initializer_list>
#include <ostream>
#include <stdexcept>

template <typename T>
class MiVector: public Contenedor<T>{
  public:
    explicit MiVector( size_t capacidadInicial = 0 )
  : datos( capacidadInicial ? new T[capacidadInicial] : nullptr),
  tam(0), cap(capacidadInicial) {};

  MiVector(std::initializer_list<T> lista): MiVector(lista.size()){
    for(const auto elem: lista) agregar(elem);
  }

  ~MiVector() override{delete[] datos;}

  bool vacio() const override{
    return tam == 0;
  }
  size_t tamano() const override {
    return tam;
  }

  void agregar(const T& x) override {
    if(tam == cap) reservar(cap==0 ? 1 : cap*2);
    datos[tam++] = x;
  }
   T& obtener(size_t i) override {
    if(i>= tam) throw std::out_of_range("Obtener: fuera de rango");
    return datos[i];
  }

  void quitar(size_t i) override{
    if(i>= tam) throw std::out_of_range("Quitar: fuera de rango");
    for(size_t j=i; j + 1 < tam; j++) datos[j] = datos[j+1];
    tam--;
  }

  T& operator() (size_t i){ return obtener(i); }

  T& operator[] (size_t i){ return obtener(i); }

  friend std::ostream& operator<<(std::ostream& os, const MiVector& vector) {
    os << "[";
    for (size_t i = 0; i < vector.tam; ++i) {
      if (i > 0) os << ", ";
      os << vector.datos[i];
    }
    return os << "]";
  }

  size_t tam;
  size_t cap;
  T* datos;

private:
  void reservar(size_t nuevaCap){
    T* nuevos= new T[nuevaCap];
    for(size_t i = 0; i<tam; i++) nuevos[i] = datos[i];
    delete[] datos;
    datos = nuevos;
    cap = nuevaCap;
  }
};
