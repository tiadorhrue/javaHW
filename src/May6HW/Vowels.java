package May6HW;

public class Vowels {

    private String vowelsOnly(String s){
        String vOnly="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
               vOnly=vOnly+s.charAt(i);
            }

        }
        return vOnly;
    }

    public static void main(String[] args) {
        Vowels obj=new Vowels();
        String vowels=obj.vowelsOnly("Tiadorh");
        System.out.println(vowels);
    }
}
