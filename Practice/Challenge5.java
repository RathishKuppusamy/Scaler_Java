//Advanced logical operator 2

public class Challenge5 {

    public static void main(String[] args) {

        //boolean male = true;
        boolean male = false;
        int age = 30;
        //if(! male ) -->Change all possible combinations and see
        if(! male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");

        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");

    }
}
