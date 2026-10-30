public class Producto : IComponente
{
    private readonly decimal _price;
    public string Name {get;}
    public Producto(string name, decimal price)
    {
        _price = price;
        Name = name;
    }
    public decimal CalculatePrice() => _price;
    public void Display(int indent)
    {
        // Imprime guiones según el nivel de profundidad
        Console.WriteLine(new string('-', indent) + $" {Name} (${_price})");
    }
}