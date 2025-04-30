using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x, y;
            Console.WriteLine("Escriba un número: ");
            y = int.Parse(Console.ReadLine());
            x = y * y;
            Console.WriteLine("El resultado de tu número al cuadrado es: " + x);
        }
    }
}
