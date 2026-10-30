public class Box: IComponente
{
    private readonly List<IComponente> _children = new();
    public string Name {get;}
    public Box(string name)=> Name = name;
    public void Add(IComponente componente) =>_children.Add(componente);
    public void Remove(IComponente componente) => _children.Remove(componente);

    public decimal CalculatePrice()
    {
        return _children.Sum(child => child.CalculatePrice());
    }
    public void Display(int indent = 0)
    {
        // 1. Dibuja la caja actual
        Console.WriteLine(new string('-', indent) + $"+ [Caja] {Name}");

        // 2. Delega el dibujo a cada hijo, aumentándoles la sangría (tabulación)
        foreach (var child in _children)
        {
            // Le pasamos el nivel actual + 2 espacios para que se vea un escalón adentro
            child.Display(indent + 2); 
        }
    }
}