public class Task_d {
    public static void main(String[] args) {
        final String ORANGE ="\u001B[38;5;214m";
        final String ORANGER ="\u001B[0m";
        final String COLOR3 = "\033[34;1m";
        final String RESET3 = "\033[30;0m";
        final String COLOR4 = "\033[37;1m";
        final String RESET4 = "\033[30;0m";
        final String COLOR5 = "\033[32;1m";
        final String RESET5 = "\033[30;0m";

        final String REDCOLOR = "\033[31;1m";
        final String REDRESET = "\033[30;0m";


        System.out.printf("%s+%10s+%10s+%10s+%s \n",ORANGE,"-----------","----------","-----------",ORANGER);
        System.out.printf("%s|%s%s%-11s%s%s|%s %s%-9s%s%s|%s %s%-10s%s%s| \n",ORANGE,ORANGER,COLOR4,"ITEM",RESET4,ORANGE,ORANGER,COLOR4,"QUANTITY",RESET4,ORANGE,ORANGER,COLOR4,"PRICE",RESET4,ORANGE,ORANGER);
        System.out.printf("%s+%10s+%10s+%10s+%s \n",ORANGE,"-----------","----------","-----------",ORANGER);
        System.out.printf("%s|%s%s%-11s%s%s|%s %s%9s%s%s|%s %s%5s%5s%s%s%s %s| \n",ORANGE,ORANGER,COLOR4,"Apples",RESET4,ORANGE,ORANGER,COLOR5,"5",RESET5,ORANGE,ORANGER,REDCOLOR,"$",REDRESET,COLOR4,"0.99",RESET4 ,ORANGE,ORANGER);
        System.out.printf("%s|%s%s%-11s%s%s|%s %s%9s%s%s|%s %s%5s%5s%s%s%s %s| \n",ORANGE,ORANGER,COLOR4,"Oranges",RESET4,ORANGE,ORANGER,COLOR5,"10",RESET5,ORANGE,ORANGER,REDCOLOR,"$",REDRESET,COLOR4,"1.49",RESET4 ,ORANGE,ORANGER);
        System.out.printf("%s+%10s+%10s+%10s+%s \n",ORANGE,"-----------","----------","-----------",ORANGER);
    }
}
