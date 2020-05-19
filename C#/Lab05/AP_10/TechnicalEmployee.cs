using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Threading.Tasks;

namespace AP_10
{
    class TechnicalEmployee:Employee
    {
        public int successfullCheckIns = 5;

        public TechnicalEmployee(String name) : base(name, 7000)
        {

        }
        public override String employeeStatus()
        {
            return this.toString() + "has" + this.successfullCheckIns + "successfull check ins";
        }
    }
}
