using System;

namespace CodeSnippet9
{
    class Student
    {
        string studentName = "James";
        string address = "California";
        public virtual void PrintDetails()
        {
            Console.WriteLine("Student Name: " + studentName);
            Console.WriteLine("Address: " + address);
        }
        
    }
    class Grade : Student
    {
        string classs = "Four";
        float persent = 71.25F;

        public override void PrintDetails()
        {
            Console.WriteLine("Class:" + classs);
            Console.WriteLine("Persentage:" + persent);
        }

        static void Main(string[] args)
        {
            Student objStudent = new Student();
            Grade objGrade = new Grade();
            objStudent.PrintDetails();
            objGrade.PrintDetails();
        }
    }
}
