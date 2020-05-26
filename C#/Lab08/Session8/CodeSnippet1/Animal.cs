﻿using System;

namespace Session8
{
    public abstract class Animal
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to survive");
        }
        public abstract void AnimalSound();
        public abstract void Habitat();
    }
}
