using System;

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
        /*public int ID
        {
            get { return id; }
            set { id = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public double Price
        {
            get { return price; }
            set { price = value; }
        }
        public string proiducer
        {
            get { return producer; }
            set { producer = value; }
        }*/
        public override string ToString()
        {
            return "Id: " + this.id + "\tName: " + this.name + "\tPrice: " + this.price + "\tProducer:  " + this.producer;
        }
        public abstract double computeTax();
    }
}
