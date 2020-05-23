using System;

namespace Ex3
{
    class CodeSnippet2
    {
        private string bookName;
        private double price;
        
        public string PrintBook()
        {
            return bookName;
        }
        public void InputBook(string bkName)
        {
            bookName = bkName;
        }
        public double Price()
        {
            return price;
        }
        public void InputPrice(double prBook)
        {
            price = prBook;
        }
        static void Main(string[] args)
        {
            CodeSnippet2 objCS2 = new CodeSnippet2();
            objCS2.InputBook("BookName: C#-The Complete Reference");
            Console.WriteLine(objCS2.PrintBook());

            objCS2.InputPrice(2000);
            Console.WriteLine("Price: " + objCS2.Price());
            /*Console.WriteLine(Convert.ToInt32(Console.ReadLine())); */
        }
    }
}
