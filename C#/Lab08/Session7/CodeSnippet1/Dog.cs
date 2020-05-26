using System;

namespace Lab08
{
    class Dog : Mammal
    {
        public void Noise()
        {
            Console.WriteLine("Dog Bark.");
        }
        public void Eat()
        {
            Console.WriteLine("Every Dog eats something.");
        }

        public void baseEat()
        {
            base.Eat();
        }

        public static void Main(string[] args)
        {
            Dog objDog = new Dog();
            objDog.Eat();
            objDog.Feature();
            objDog.Noise();
            objDog.baseEat();

        }
    }
}
