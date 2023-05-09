package May7HW;

public class StaticConstruct {

    static String name(String str) {
        String strr="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' ){
                strr=strr+str.charAt(i);

        }
    }
    return strr;

}

    public static void main(String[] args) {
        System.out.println(name("Tiaaadoreeeee"));
    }
}
