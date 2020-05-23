using System;

namespace Ex2
{
    class StudentDetails
    {
        private string studName;
        private int rollNumber;

        public StudentDetails(string studName,int rollNumber)
        {
            this.studName = studName;
            this.rollNumber = rollNumber;
        }
        static void Main(string[] args)
        {
            /*StudentDetails objStudents = new StudentDetails();
            Console.WriteLine("Student Name: " + objStudents.studName);
            Console.WriteLine("Roll Number: " + objStudents.rollNumber);*/

            StudentDetails objStudents2 = new StudentDetails("Dat", 19);
            Console.WriteLine("Student Name: " + objStudents2.studName);
            Console.WriteLine("Roll Number: " + objStudents2.rollNumber);
        }
    }
}
