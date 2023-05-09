package April29HW;

import com.sun.source.tree.PatternCaseLabelTree;

public class Palindrome {

    boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);

        }

    public static void main(String[] args) {

        Palindrome obj = new Palindrome();
        boolean result=obj.isPalindrome("aba");
        System.out.println(result);





    }
}
