public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("SISTEMA BANCARIO");
        CuentaBancaria ahorro = new CuentaAhorro("CA-001", 1000);
        CuentaBancaria corriente = new CuentaCorriente("CO-002", 5000, 2000);
        CuentaBancaria credito = new CuentaCredito("CC-003", 0, 10000, 0);

        Cliente cliente1 = new Cliente("Alexa", "001", ahorro);
        Cliente cliente2 = new Cliente("Pamela", "002", corriente);
        Cliente cliente3 = new Cliente("Vane", "003", credito);
        cliente1.depositar(900);
        cliente2.retirar(2000);
        cliente3.retirar(1000);
        cliente3.pagarDeuda(200);

        for (Cliente cliente : new Cliente[]{cliente1, cliente2, cliente3}) {
            cliente.mostrarInformacion();
            System.out.println("Saldo: " + cliente.consultarSaldo());
            System.out.println("Intereses: " + cliente.calcularIntereses());
        }
        System.out.println("LSP malo: pagarDeuda no funciona con todas las cuentas.");
        try {
            cliente1.pagarDeuda(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
