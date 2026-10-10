public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;
    private double tasaInteres;

    public CuentaCorriente(String numeroCuenta,  double saldoInicial, double limiteSobregiro){
        super(numeroCuenta, saldoInicial);
        if(limiteSobregiro<0){
            throw new IllegalArgumentException("El límite Sobregiro no debe ser menor a 0.");
        }
        this.limiteSobregiro=limiteSobregiro;
        this.tasaInteres= 0.02;
    }
    @Override
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if(cantidad> saldo + limiteSobregiro){
            throw new IllegalArgumentException("La operación excede el límite.");
        }
        saldo -= cantidad;
    }
    @Override
    public double calcularIntereses(){
        if(saldo <0){
            return Math.abs(saldo) * tasaInteres;
        }
        return 0;
    }
    public double ConsultarSobregiroUtilizado(){
        if(saldo<0){
            return Math.abs(saldo);
        }
        return 0;
    }
    public double getLimiteSobregiro(){
        return limiteSobregiro;
    }
}
