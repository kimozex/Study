﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApp3
{
    internal class Starter
    {
        [STAThread]
        static void Main(string[] args)
        {
            App app = new();
            app.Run();
        }
    }
}
