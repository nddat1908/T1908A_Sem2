using System;
using System.Net.Http.Headers;

namespace CodeSnippet6
{
    static class CodeSnippet6
    {
        static int productId;
        static double price;
        
        static CodeSnippet6()
        {
            productId = 10;
            price = 156.32;
        }
        public static void Display()
        {
            Console.WriteLine("Product ID: " + productId);
            Console.WriteLine("Product price: " + price);
        }
        
    }

    class Medicine
    {
        static void Main(string[] args)
        {
            CodeSnippet6.Display();
        }
    }
}
