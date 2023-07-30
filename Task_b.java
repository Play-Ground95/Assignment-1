public class Task_b {
    public static void main(String[] args) {
        final String COLOR3 = "\033[34;1m";
        final String RESET3 = "\033[30;0m";
        final String COLOR2 = "\033[33;1m";
        final String RESET2 = "\033[30;0m";

        final String ORANGE ="\u001B[38;5;214m";
        final String ORANGER ="\u001B[0m";


        System.out.printf("%s+%15s+%5s+%s \n",ORANGE,"---------------","------",ORANGER);
        System.out.printf("%s|%s%s%-15s%s%s|%s %s%-5s%s%s|%s \n",ORANGE,ORANGER,COLOR3,"NAME",RESET3,ORANGE,ORANGER,COLOR3,"AGE",RESET3,ORANGE,ORANGER);
        System.out.printf("%s+%15s+%5s+%s \n",ORANGE,"---------------","------",ORANGER);
        System.out.printf("%s|%s%-15s%s|%s %s%-5s%s%s|%s \n",ORANGE,ORANGER,"Alice",ORANGE,ORANGER,COLOR2,"24",RESET2,ORANGE,ORANGER);
        System.out.printf("%s|%s%-15s%s|%s %s%-5s%s%s|%s \n",ORANGE,ORANGER,"Bob",ORANGE,ORANGER,COLOR2,"30",RESET2,ORANGE);
        System.out.printf("%s+%15s+%5s+%s \n",ORANGE,"---------------","------",ORANGER);
    }
}
