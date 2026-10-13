public class Venta
{
    private readonly IAlmacen _almacen;
    public Venta(IAlmacen almacen)
    {
        _almacen = almacen;
    }
    public bool CobrarProducto()
    {
        CobrarProducto venta = _almacen.BuscarProducto(codigo);
        if(_almacen.BuscarProducto(codigo) == null) return false;
        double total = venta.Precio * cantidad;
        System.Console.WriteLine($"[CAJA]: venta realiza con exito por el producto {venta.Nombre}, total {total}");
        return true;
    }
}