using System;
public class Program
{
    public static void Main()
    {
        IComponente ram = new Producto("Memoria RAM", 80m);
        IComponente cpu = new Producto("CPU", 220m);
        IComponente mouse = new Producto("Mouse inalambrico", 25m);
        IComponente keyboard = new Producto("Teclado", 45m);
        IComponente cable = new Producto("Cable HDMI", 15m);

        Box pcBox = new Box("Caja de componentes");
        Box peripheralsBox = new Box("Caja de perifericos");
        Box mainOrder = new Box("Pedido principal");

        pcBox.Add(ram);
        pcBox.Add(cpu);

        peripheralsBox.Add(mouse);
        peripheralsBox.Add(keyboard);

        mainOrder.Add(pcBox);   
        mainOrder.Add(peripheralsBox);
        mainOrder.Add(cable);

        System.Console.WriteLine($"====Calculo individual de sub-arboles===");
        System.Console.WriteLine($"Total caja de PC: ${pcBox.CalculatePrice()}");
        System.Console.WriteLine($"Total caja de perifericos: ${peripheralsBox.CalculatePrice()}");

        System.Console.WriteLine($"===Calculo completo empezando por la raiz del arbol mayor mega devorando===");
        System.Console.WriteLine($"Total pedido principal: ${mainOrder.CalculatePrice()}\n");
        mainOrder.Display(0);
    }
}