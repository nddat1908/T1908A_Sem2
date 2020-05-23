using System;

namespace CodeSnippet17
{
    class CodeSnippet17
    {
        string empName;
        int empAge;
        string deptName;
        CodeSnippet17(string name,int num)
        {
            empName = name;
            empAge = num;
            deptName = "Research & Development";
        }
        static void Main(string[] args)
        {
            CodeSnippet17 objCS17 = new CodeSnippet17("John", 10);
            Console.WriteLine(objCS17.deptName);
        }
    }
}
