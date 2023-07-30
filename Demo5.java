public class Demo5 {
    public static void main(String[] args) {
    
    final String COLOR1 = "\033[31;1m";
    final String RESET1 = "\033[30;0m";

    
    int isbn1 = 978;
    int isbn2 = 3;
    int isbn3 = 16;
    int isbn4 = 1484100;

    System.out.printf("ISBN :%s%d%s-%s%d%s-%s%d%s-%s%d%s \n",COLOR1, isbn1,RESET1,COLOR1, isbn2,RESET1, COLOR1,isbn3,RESET1, COLOR1,isbn4,RESET1);
    }
}
