package main

import "fmt"

func main() {
	fmt.Println("====ENTORNO REAL====")

	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "123456"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "5678!#$"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changito@gmail.com", 150.00)

	fmt.Println("====ENTORNO PRUEBA====")
	pasarelaMock := &SimuladorPasarela{DebeFallar: false}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("tilinis@gmail.com", 3000.00)
}
