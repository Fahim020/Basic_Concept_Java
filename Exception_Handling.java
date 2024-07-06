
public class Exception_Handling {

    public static void main(String[] args) {
        
        int [] marks = {98,97,95};
        
        // Exception Handling (try-catch)
        try{
            System.out.println(marks[4]);
        }
        catch(Exception exception)
        {

            System.out.println("An exception for caught while accessing an index 'marks' array");
        }


        System.out.println("we tried to print marks and an exception must have occured with index >=3 ");
    }
    
}
