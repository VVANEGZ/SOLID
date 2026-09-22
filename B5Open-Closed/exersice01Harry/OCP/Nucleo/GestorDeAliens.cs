using System.Data.Common;
using System.Runtime.InteropServices;
using OCP.Aliens;
using OCP.Extensiones;

namespace OCP.Nucleo;
public class GestorDeAliencs
{
    private List<(string nombre, Func<IAlien> Crear, bool Desbloqueado)> _catalogo= new (){
        ("Fuego", () => new Fuego(), true),
        ("Humungosaurio", ()=> new Humongusaurio(), true),
        ("Cuatro brazos", () => new CuatroBrazos(), true)
    };
    private readonly List<(string Nombre, Func<IAlien> Crear)> _escanearADN = new();
   
    private readonly Dictionary<Type, Func<IAlien>> _supremos = new()
    {
        {typeof(HumongusaurioSupremo), () => new HumongusaurioSupremo()}
    };

    private readonly List <(string Nombre, Func<IAlien> Crear)> _fusiones = new()
    {
        ("Humungosaurio + CuatroBrazos", () => new Fusion <Humongusaurio, CuatroBrazos> ()),
        ("Fuego + CuatroBrazos", () => new Fusion<Fuego, CuatroBrazos>()),
        ("Fuego + Humongosaurio", () => new Fusion<Fuego, Humongusaurio>())
    };
    public List <(string Nombre, Func<IAlien> Crear)> ObtenerDesbloqueados()
    {
        var lista = _catalogo
            .Where(a => a.Desbloqueado)
            .Select(a => (a.Desbloqueado, a.Crear))
            .ToList();
        lista.AddRange(_escanearADN);
        return lista;
    }
    public List<string> ObtenerDesbloqueados() => _catalogo.Where(a=> a.Desbloqueado).Select(a => a.nombre);
}