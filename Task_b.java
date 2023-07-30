public class Task_b {
    public static void main(String[] args) {
        final String COLOR3 = "\033[34;1m";
        final String RESET3 = "\033[30;0m";
        final String COLOR2 = "\033[33;1m";
        final String RESET2 = "\033[30;0m";

        System.out.printf("+%15s+%5s+ \n","---------------","------");
        System.out.printf("|%s%-15s%s| %s%-5s%s| \n",COLOR3,"NAME",RESET3,COLOR3,"AGE",RESET3);
        System.out.printf("+%15s+%5s+ \n","---------------","------");
        System.out.printf("|%-15s| %s%-5s%s| \n","Alice",COLOR2,"24",RESET2);
        System.out.printf("|%-15s| %s%-5s%s| \n","Bob",COLOR2,"30",RESET2);
        System.out.printf("+%15s+%5s+ \n","---------------","------");
    }
}
