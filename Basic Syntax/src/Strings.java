public class Strings {

    public static void main(String[] args){

        String str1 = "My name is";
        String str2 =  new String("Kevin Min");

        /**concatenation*/
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str3 + 100);

        /*length*/
        System.out.println(str3.length());

        /*String to Array*/


        /*String operation*/
        String str4 = "java is everywhere";
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());

        System.out.println(str4.contains("java"));
        System.out.println(str4.contains("python"));

        System.out.println(str4.charAt(0));
        System.out.println(str4.indexOf('j'));



    }

}
