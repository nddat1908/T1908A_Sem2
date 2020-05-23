using System;

namespace CodeSnippet15
{
    class CodeSnippet15
    {
        double length;
        double breadth;
        public double Area(double length,double breadth)
        {
            this.length = length;
            this.breadth = breadth;
            return length * breadth;
        }
        static void Main(string[] args)
        {
            CodeSnippet15 objCS15 = new CodeSnippet15();
            Console.WriteLine("Area of rectangle = " + objCS15.Area(10.5, 12.5));
        }
    }
}
