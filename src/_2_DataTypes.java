public class _2_DataTypes {
    public static void main(String[] args) {
        //Whole Numbers
        byte by=127;
        System.out.println("the value of byte variable is " +by);
        short sh = 32666;
        System.out.println("Short variable is: "+sh);
        int i = 222;
        System.out.println("value of int variable is:"+i);
        long l = 555555L;
        System.out.println("value of long variable is:"+l);

        //Decimal Numbers
        float fl = 7.5f;
        System.out.println("value of float variable is: "+fl);

        double d = 3.5;
        System.out.println("value of double variable: "+d);

        boolean bl = true;
        System.out.println("value of bool variable: "+bl);

        char ch = 'E';
        System.out.println("value of char variable is: "+ch);

        //Widely casting (store int into long - small size into large size)
        int i2 = 555;
        long l2 = i2;
        System.out.println("Widely Casting: "+l2);

        //Narrow Casting(unsave because convert large size to small - explicit write cast)
        long l3 = 777666555444333l;
        int i3 = (int)l3;
        System.out.println("Narrow Casting:"+i3);  //Garbage value
    }
}
