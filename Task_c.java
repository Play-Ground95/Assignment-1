public class Task_c {
    public static void main(String[] args) {
        final String ORANGE ="\u001B[38;5;214m";
        final String ORANGER ="\u001B[0m";
                final String COLOR3 = "\033[34;1m";
        final String RESET3 = "\033[30;0m";

        System.out.printf("%s+%15s+%10s+%12s+%s \n",ORANGE,"---------------","-----------","-------------",ORANGER);
        System.out.printf("%s|%s%s%-15s%s%s|%s %s%-10s%s%s|%s %s%-12s%s%s| \n",ORANGE,ORANGER,COLOR3,"CITY",RESET3,ORANGE,ORANGER,COLOR3,"STATE",RESET3,ORANGE,ORANGER,COLOR3,"POPULATION",RESET3,ORANGE,ORANGER);
    }
}
