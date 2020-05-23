using System;

namespace CodeSnippet19
{
    public class CodeSnippet19
    {
        double length;
        double breadth;
        public CodeSnippet19()
        {
            length = 13.5;
            breadth = 20.5;
        }
        public CodeSnippet19(double len, double wide)
        {
            length = len;
            breadth = wide;
        }
        public double Area()
        {
            return length * breadth;
        }
        static void Main(string[] args)
        {
            CodeSnippet19 objCS19 = new CodeSnippet19();
            Console.WriteLine("Area of  rectangle = " + objCS19.Area());

            CodeSnippet19 objCS19_1 = new CodeSnippet19(2.5,6.9);
            Console.WriteLine("Area of  rectangle = " + objCS19_1.Area());
        }
    }
}
