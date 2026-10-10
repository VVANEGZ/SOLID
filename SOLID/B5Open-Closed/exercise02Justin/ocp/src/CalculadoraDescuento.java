public class CalculadoraDescuento {
    public double aplicarDescuento(String tipoDescuento, double subtotal){
        if(tipoDescuento.equals("descuento navidad")){
            return subtotal * 0.90;
        } else if(tipoDescuento.equals("sin descuento")){
            return subtotal;
        } else{
            throw new IllegalArgumentException("Descuento no válido.");
        }
    }
}
