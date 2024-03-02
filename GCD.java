//package DSA;

public class GCD {
    //recursive functin of a and b.
    static int hcf(int a ,int b){
        if (a==0)
        return b;
        if (b==0)
        return a;

        //base class
        if (a==b)
        return a;

        if (a>b);
            return hcf(a-b, b);
      //return hcf(a, b-a);

    }  
    public static void main (String []args)
    {
        int a = 3;
        int b = 12;
        System.out.println("a : " + a + " ,b : " + b + " is " + hcf(a,b));
    }
}
