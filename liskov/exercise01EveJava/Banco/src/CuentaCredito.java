public class CuentaCredito extends CuentaBancaria{
    private double limiteCredito;
    private double deuda;
    private double tasaInteres;


    public CuentaCredito(String CuentaBancaria, double saldoInicial, double limiteCredito, double deuda) {
        super(CuentaBancaria, saldoInicial);
        if(limiteCredito<0){
            throw new IllegalArgumentException("El límite de crédito no debe superar");
        }
        this.limiteCredito = limiteCredito;
        this.deuda = 0;
        this.tasaInteres=0.03;
    }

    public void retirar(double cantidad){
        if(cantidad< deuda + limiteCredito){
            throw new IllegalArgumentException("La operación excedió el límite.");
        }
        deuda += cantidad;
    }
    public void depositar(double cantidad){
        validarCantidad(cantidad);
        deuda -= cantidad;
    }
    public double consultarSaldo(){
        return limiteCredito - deuda;
    }
    public double calcularIntereses(){
        return deuda * tasaInteres;
    }
    public void  pagarDeuda(double cantidad){
        validarCantidad(cantidad);
        if(cantidad > deuda){
            cantidad = deuda;
        }
            deuda -= cantidad;
    }

    public double consultarDeuda(){
        return deuda;
    }

    public double consultarCreditoDisponible()
}
