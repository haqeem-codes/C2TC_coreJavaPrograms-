package package2;

import com.tnsif.Day4.package1.Base;

public class Executor {
    public static void main(String[] args) {
        Base b1 = new Base();

        // Can't access private, default, protected members from different package without inheritance
        /*
         b1.varPrivate = 21;      // error - private
         // b1.methodPrivate();   // no such method
         b1.varDefault = 11;      // error - default
         b1.methodDefault();      // error - default
         b1.varProtected = 31;    // error - protected 
         b1.methodProtected();    // error - protected
        */

        // Allowed access to public methods and variables
        b1.methodPublic();
        b1.varPublic = 41;
        b1.methodPublic();
    }
}
