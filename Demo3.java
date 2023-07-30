public class Demo3 {
    public static void main(String[] args) {

        
        final String COLOR = "\033[32;1m";
        final String RESET = "\033[30;0m";

        
        System.out.printf("%s(123)%s %s-%s \n",COLOR,RESET,456,7890);
    }
}
