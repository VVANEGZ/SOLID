public class CuentaAhorro extends Cuenta{
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldoInicial){
        super(numeroCuenta, saldoInicial);
        this.tasaInteres= tasaInteres;
    }
    public double calcularIntereses(){
        return saldo*tasaInteres;
    }
    public void pagarDeuda(){
        throw new IllegalArgumentException("No hay deuda que pagar.");
    }
}
