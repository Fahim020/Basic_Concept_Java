
public class Non_Primitive_DataTypes {
    public static void main (String[] args){

        // NON-PRIMITIVE DATA TYPES....STRING
        //BASIC
        String str1 = "value"; 
        String str2 = new String("value");
        String str3 = String.valueOf(123);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

System.out.println("\n");       

        // CONCATENATION....
        String k = 3 + "str" + 3;     // 3str3
        String f = 3 + 3 + "str";     // 6str
        String r = "3" + 3 + "str";   // 33str
        String g = "3" + "3" + "23";  // 3323
        String i = "" + 3 + 3 + "23"; // 3323
        String s = "3 + 3 + 23";        // 29 // ERROR OUTPUT

        System.out.println(k);
        System.out.println(f);
        System.out.println(r);
        System.out.println(g);
        System.out.println(i);
        System.out.println(s);
        
System.out.println("\n");

        // COMPARSION....
        String s1 = new String("Fahim"); 
        String s2 = new String("Fahim"); 

       System.out.println( s1 == s2);          // false
       System.out.println(s1.equals(s2));     // true

 System.out.println("\n");

       //MANIPULATION....
       String fah = "Abcd";

       fah.toUpperCase();     // ABCD
       fah.toLowerCase();     // abcd
       fah.concat("#");       // Abcd#
       fah.replace("b", "f"); // Afcd

       "  abc ".trim();       // abc
       "ab".toCharArray();    // {'a', 'b'} 
        
       System.out.println(fah.toUpperCase());
       System.out.println(fah.toLowerCase());
       System.out.println(fah.concat("#"));
       System.out.println(fah.replace("b", "f"));
       
       System.out.println("  abc ".trim());
       System.out.println("ab".toCharArray());

System.out.println("\n");

        //INFORMATION /METHOD....

        String str = "abcd";

        str.charAt(2);       // c
        str.indexOf("a") ;    // 0
        str.indexOf("z");     // -1
        str.length();        // 4
        str.toString();      // abcd
        str.substring(2);    // cd
        str.substring(2,3);  // c
        str.contains("c");   // true
        str.endsWith("d");   // true
        str.startsWith("a"); // true
        str.isEmpty();       // false


        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.length());
        System.out.println(str.toString());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,3));
        System.out.println(str.contains("c"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.isEmpty());

 System.out.println("\n");


        // IMUPLATE....

        String sha = "hello";
        sha.concat("world");

         // Outputs: hello
        System.out.println(sha);


        String kha = "hello";
        String concat = kha.concat("world");

        // Outputs: helloworld
        System.out.println(concat);
//Once created cannot be modified, any modification creates a new String




    }
}
