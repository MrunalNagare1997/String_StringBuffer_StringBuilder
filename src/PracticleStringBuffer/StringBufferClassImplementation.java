package PracticleStringBuffer;

import java.util.stream.IntStream;

public class StringBufferClassImplementation {

    public static void main(String args[])
    {


        //This constructor creates a stringbuffer with the given string and reserves the extra space for 16 characters...
        StringBuffer strb1= new StringBuffer("nothing");


        //returns the capacity of the string buffer...
        System.out.println("\n\ncapacity: "+strb1.capacity()+"\n"+strb1);

        //increases the capacity to 25 and changes the string to the specified string...
        System.out.println("\n\nReplace...");
        strb1.replace(0,25,"mrunalskdbfhajrisdmehabsd");
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);


        //appends the new character sequence at the end of the present sequence...
        System.out.println("\n\nAppend...");
        strb1.append("mrunal");
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);

        System.out.println("code point count: "+strb1.codePointCount(0,strb1.length()));


        //trims the capacity to the amount that is only required...
        System.out.println("\n\nTrim...");
        strb1.trimToSize();
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);

        //Reverse...
        System.out.println("\n\nReverse...");
        System.out.println(strb1.reverse());
        System.out.println(strb1);

        //ensure capacity....
        System.out.println("\n\nEnsure Capacity...");
        strb1.ensureCapacity(63);
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);


        //Char Array...
        System.out.println("\n\nGet Chars...");
        char[] charArray= new char[20];
        strb1.getChars(0,7,charArray,0);
        System.out.println(charArray);

        //setLength...
        System.out.println("\n\nSet Length...");
        strb1.setLength(70);
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);
        strb1.setLength(2);
        System.out.println("capacity: "+strb1.capacity()+"\n"+strb1);

    }

}
