using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x, y, z, a;
            Console.WriteLine("Ingrese el primer número: ");
            x=double.Parse(Console.ReadLine());
            Console.WriteLine("Ingrese el segundo número: ");
            y=double.Parse(Console.ReadLine());
            Console.WriteLine("Ingrese el tercer número: ");
            z=double.Parse(Console.ReadLine());
            a = (x + y + z) / 3;
            Console.WriteLine("El resultado de la media es: " + a);
        }
    }
}
