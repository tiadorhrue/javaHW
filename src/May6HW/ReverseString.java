package May6HW;

import com.sun.tools.javac.Main;

public class ReverseString {
    String revStr(String s){
        String revs="";
        for (int i = s.length()-1; i >=0; i--) {
            revs=revs+s.charAt(i);
        }
        return revs;
    }

    public static void main(String[] args) {
        ReverseString obj=new ReverseString();
       String revS= obj.revStr("Tiadorh");
        System.out.println(revS);

    }
}
