public class AdditionalOperations_Datatypes {

    public static void main(String[] args){

//    Print single character from a string
        String str = "hello Java";
        char c;
        c = str.charAt(6);
//        or    char c = str.charAt(6);
        System.out.println(c);


//        Constatnts --> The value assigned to it cannot be changed anywhere
        final int x = 400;
        final int y;
        y = 300;
        System.out.println(x + " " + y);

        /*  x = 20;
        java: cannot assign a value to final variable x */


//    TypeCasting --> 2 Types
        // Widening --> Small into Large
            int i1 = 100;
            long i2 = i1;
            System.out.println(i2);

        // Explicit  --> Large into Small
            // Values should make sense, 1000 cannot be assigned to a byte
            long i3 = 200000000L;
            /*  int i4 = i3;
        java: incompatible types: possible lossy conversion from long to int */
            int i4 = (int)i3; //denotes long wants to be converted to int
            System.out.println(i4);

    }

}
