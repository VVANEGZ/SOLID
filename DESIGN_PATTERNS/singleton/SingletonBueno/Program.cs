public class Program
{
    public static void Main()
    {
        IAlmacen almacenGlobal = AlmacenCentral.Instancia;
        Inventario empleadoInventario = new Inventario();
        Venta empleadoVenta = new Venta(almacenGlobal);

        empleadoInventario.RegistrarProducto("Coca", 20.00, 1,10);
        
        empleadoInventario.RegistrarProducto("Azucar", 20.00, 1,10);
        empleadoInventario.RegistrarProducto("Bubulubu", 5.00, 1,10);
        empleadoInventario.RegistrarProducto("Pepsi", 12.00, 1,10);

        empleadoVentap
    }
}