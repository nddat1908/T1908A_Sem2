﻿using System;

namespace CodeSnippet13
{
    class CodeSnippet13
    {
        static void Depreciation(out int val)
        {
            val = 20000;
            int dep = val * 5 / 100;
            int amt = val - dep;
            Console.WriteLine("DepreciationAmount:" + dep);
            Console.WriteLine("Reduced value after depreciation: " + amt);
        }
        static void Main(string[] args)
        {
            int value;
            Depreciation(out value);
        }
    }
}
