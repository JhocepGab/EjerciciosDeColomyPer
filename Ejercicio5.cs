using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x, y;

            Console.Write("Ingresa el valor del radio: ");
            x = double.Parse(Console.ReadLine());

            y = Math.PI * Math.Pow(x, 2);

            Console.WriteLine("El área del círculo es: " + y);
        }
    }
}
