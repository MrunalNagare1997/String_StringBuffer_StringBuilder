package PracticeStringBuilder;
import java.lang.StringBuilder;

public class StringBuilderClassImplementation {

    public static void main(String args[])
    {
        boolean flag=true;

        //This constructor creates a string builder, initializes it with "String"
        //and reserves the extra space for 16 characters.
        StringBuilder strb = new StringBuilder("String");
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Append...(appends the string with the string representation of the boolean flag.)
        System.out.println("\n\nAppend...");
        strb.append(flag);
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Insert...
        System.out.println("\n\nInsert...");
        strb.insert(3,"String");
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //CharacterAt...
        System.out.println("\n\nCharacter At...");
        System.out.println(strb.charAt(12));

        //Replace...
        System.out.println("\n\nReplace...");
        strb.replace(0,strb.length(),"Mrunal");
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Reverse...
        System.out.println("\n\nReverse");
        strb.reverse();
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Set character at...
        System.out.println("\n\nSet character at...");
        strb.setCharAt(1,'K');
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Set Length...
        System.out.println("\n\nSet Length...");
        strb.setLength(6);
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

        //Trim to size...
        System.out.println("\n\nTrim to size...");
        strb.trimToSize();
        System.out.println(strb);
        System.out.println(strb.length());
        System.out.println(strb.capacity());

    }


}
