// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Prime Number

import static java.lang.System.*;

public class PrimeRunner
{
    public static void main(String[] args) {
        //add test cases
        Prime test = new Prime(24);
        out.println(test);

        test.setPrime(7);
        out.println(test);

        test.setPrime(100);
        out.println(test);

        test.setPrime(113);
        out.println(test);

        test.setPrime(65535);
        out.println(test);

        test.setPrime(2);
        out.println(test);

        test.setPrime(7334);
        out.println(test);

        test.setPrime(7919);
        out.println(test);

        test.setPrime(1115125003);
        out.println(test);

    }
}
