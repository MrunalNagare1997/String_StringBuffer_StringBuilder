package PracticleString;
import java.lang.String;
public class StringClassImplementation {

    public static void main(String args[])
    {
        String str1= new String("Gopal");
        String str2= new String("Gopal");

        //It checks weather the references to the object are same.
        if(str1==str2) {
            System.out.println("Strings are equal");
        }
        else
            System.out.println("Strings are not equal");


        //equals method checks the actual value in the variable.
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else
                System.out.println("Strings are not equal");

        //As the "==" operator checks the references to the objects it is not a good idea to rely on it.

        //Immutability check...
        str1.concat(str2);
        System.out.println("Str1: "+str1);

        str1=str1.concat(str2);
        System.out.println("After concatenation \nStr1: "+str1);
        //it shows that the string cannot be modified. when we do str1.concat(str2), it creates the new object of str2.
        //when we assign the new object to str1 it points to the newly created object but the old str1 object also remains in the memory

        System.out.println(str1.compareToIgnoreCase(str2+str2));

        //Index of...
        System.out.println("Index of str2 in str1: "+str1.indexOf(str2));
        System.out.println("Last index of str2 in str1: "+str1.lastIndexOf(str2));
        System.out.println("Index of str2 in str1 starting from 5: "+str1.indexOf(str2, 5));

        //Replace...
        str1=str1.replace('G','g');
        System.out.println("After replacement: "+str1);
    }

}
