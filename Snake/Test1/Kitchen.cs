using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test1
{
    class Kitchen
    {
        int xlim;
        int ylim;
        char symb;
        Random rand = new Random();

        public Kitchen(int xlim, int ylim, char symb)
        {
            this.xlim = xlim;
            this.ylim = ylim;
            this.symb = symb;
        }

        public Point Cooking()
        {
            int x = rand.Next(2, xlim - 2);
            int y = rand.Next(2, ylim - 2);
            return new Point(x, y, symb);
        }
    }
}
