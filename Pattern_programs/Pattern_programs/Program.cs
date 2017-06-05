using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Pattern_programs
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter how many rows you want ");
            int r = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i <= r; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("* ");
                }
                Console.WriteLine();
            }
            Console.Read();
        }
    }
}
