public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldoInicial){
        super(numeroCuenta, saldoInicial);
        this.tasaInteres= 0.05;
    }
    public double calcularIntereses(){
        return saldo*tasaInteres;
    }
    @Override
    public void pagarDeuda(double cantidad){
        throw new IllegalArgumentException("No hay deuda que pagar.");
    }
}
