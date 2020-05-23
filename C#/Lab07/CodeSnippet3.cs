using System;

namespace Ex4
{
    class CodeSnippet3
    {
        void printName(String firstName, String lastName)
        {
            Console.WriteLine("Fisrt Name = {0}, Last Name = {1}", firstName, lastName);
            
        }
        static void Main(string[] args)
        {
            CodeSnippet3 st = new CodeSnippet3();
            st.printName("Henry", "Parker");

            st.printName(firstName: "Henry", lastName: "Parker");
            st.printName(firstName: "Parker", lastName: "Henry");

            st.printName("Henry", lastName: "Parker");
        }
    }
}
