﻿using System;

namespace Practice
{
    abstract class Product
    {
        protected int id;
        protected string name;
        protected double price;
        protected string producer;
        
        public Product(int id,string name,double price,string producer)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.producer = producer;
        }
        
        public override string ToString()
        {
            return "Id: " + this.id + "\tName: " + this.name + "\tPrice: " + this.price + "\tProducer:  " + this.producer;
        }
        public abstract double computeTax();
    }
}
