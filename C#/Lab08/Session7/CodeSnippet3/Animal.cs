using System;

namespace CodeSnippet3
{
    class Animal
    {
        protected string Food;
        protected string Activity;
        
    }

    class Cat : Animal
    {
        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            objCat.Food = "Mouse";
            objCat.Activity = "lazearound";
            Console.WriteLine("The Cat loves to eat" + objCat.Food + ".");
            Console.WriteLine("The Cat loves to " + objCat.Activity + ".");
        }
    }
}
