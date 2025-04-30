using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double a, b, x, igv, total;
            Console.Write("Ingresa el valor de a: ");
            a = double.Parse(Console.ReadLine());
            Console.Write("Ingresa el valor de b: ");
            b = double.Parse(Console.ReadLine());
            x = Math.Pow(a + b, 2);
            igv = x * 0.19;
            total = x + igv;
            Console.WriteLine("IGV (19%): " + igv);
            Console.WriteLine("Precio total con IGV: " + total);
        }
    }
}
