using System;
using System.Collections.Generic;
using System.Text;

namespace Practice
{
    class Book : Product
    {
        public Book(int id,string name,double price,string producer) : base(id,name,price,producer)
        {

        }
        public override double computeTax()
        {
            return price * 8 / 100;
        }
    }
}
