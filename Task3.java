public class Task3 {
    public static String rev(String a){
        return new StringBuilder(a).reverse().toString();

    }
    public static void main(String[] args){
        String a="java interview";
        a=rev(a);
        System.out.println(a);


    }
}