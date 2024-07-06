
public class Type_Casting {

    public static void main(String[] args){

      //  IMPLICIT TYPECASTING....

      int a = 9;
      double b = a; //Automatic casting : int to double 

     System.out.println("The value of implicit typecasting");
      System.out.println(a);
      System.out.println(b);
      

       /// EXPLICIT TYPECASTING....
        
       double x = 98.5d;
       int y = (int) x; // Manual casting: double ti int

       System.out.println("The value of Explicit typecasting");
       System.out.println(x);
       System.out.println(y);



    }
    
}
