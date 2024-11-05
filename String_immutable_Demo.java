import java.io.*;
import java.lang.*;
class String_immutable_Demo
{
    public static void main(String args[]){
        String s="Sasi";
        s.concat("Site");
        System.out.println("After concating s1 and s2"+s);
        String S="Santhosh";
        S=S.concat("P");
        System.out.println("After concatinating s1 and s2- "+S);
    }
}
