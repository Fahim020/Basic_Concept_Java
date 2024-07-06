
public class Break_and_Continue {

    public static void main(String[] args) {
        
        // break statement
        for(int i=0; i<10; i++){

           if(i==4)
           {
            break;
           }
           System.out.println(i);
        }

       // Continue statement
        for(int j=0; j<10; j++){

            if(j==4)
            {
                continue;
            }
            System.out.println(j);
        }


    }
    
}
