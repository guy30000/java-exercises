package exercises.hackerrank;

public class Binary_Numbers {


    public static void main(String[] args) {

        ///This will convert to binary
        int n = 10;
        String s = "";
        while (n > 0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;

        }
        System.out.println(s + " type 1");

///another way
        n = 49;
        int count = 0, a;

        String x = "";
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println(x + " type 2");

// Binary consecutive 1 counter
        n = 888888888;
        count = 0;
        a=0;
        int finalCount=0;
        int currentCount=0;

        x = "";
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
                currentCount++;
            }
            x = a + "" + x;
            n = n / 2;
            if (a==0 || n==0){
                if (currentCount>finalCount)finalCount=currentCount;
                currentCount=0;
            }
        }
        System.out.println(finalCount + " String counter " + x);




    }

}
