using System;

namespace Lab07
{
    class Student
    {
        string studName ;
        int stuAge ;

        void Display()
        {
            Console.Write("Enter name: ");
            Console.WriteLine("Student Name: " + Console.ReadLine() + studName);
            Console.Write("Enter age: ");
            Console.WriteLine("Student Age: " + Convert.ToInt32(Console.ReadLine()));
        }
        static void Main(string[] args)
        {
            Student objStudents = new Student();
            objStudents.Display();
        }
    }
}
