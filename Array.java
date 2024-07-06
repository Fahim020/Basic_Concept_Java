
public class Array {
    
public static void main( String[] args)
{

   //  Method 1.
   int [] a;  //decalratioin
   a=new int [5];  // memory allocation
      
    a[0]=45;
    a[1]=48;
    a[2]=49;
      
        System.out.println(a[2]);
    
   

    // Method 2.
   //Declartion and then memory allocation
   int marks[] = new int [5];
   // Initialization
   marks[0]=100;
   marks[1]=70;
   marks[2]=80;
   marks[3]=71;
  marks[4]=98;
   
  // for(int i=0;i<=5;i++){
    

    System.out.println(marks[3]);

  // }
  

   // Method 3.
   float arr[] = {9.5f,5.5f,6.5f}; // Decalartion + initialization
   System.out.println(arr[1]);


}

}
