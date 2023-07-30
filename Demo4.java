public class Demo4 {
    public static void main(String[] args) {
        final String COLOR1 = "\033[32;1m";
        final String RESET1 = "\033[30;0m";

        final String COLOR2 = "\033[33;1m";
        final String RESET2 = "\033[30;0m";

        final String COLOR3 = "\033[34;1m";
        final String RESET3 = "\033[30;0m";

        System.out.printf("%s12%s/%s28%s/%s2023%s %s23%s:%s59%s:%s59%s \n",COLOR1,RESET1,COLOR2,RESET2,COLOR3,RESET3,COLOR2,RESET2,COLOR3,RESET3,COLOR1,RESET1);
    }
}
