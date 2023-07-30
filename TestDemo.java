public class TestDemo {

  
    public static void main(String[] args) {
        
        final int id = 1;
        String name = "Kasun Sampath";
        double avgMarks = 65.67999;

        System.out.printf("id=S%04d, name=%s, avgMarks=%.2f \n", id, name, avgMarks);
        System.out.println();

        final String LINE = "+%6s+%1$15s+%1$6s+ \n";
        final String RECORD = "|SK-%03d|%-15s|%6.2f| \n";

        System.out.printf(LINE, "");
        System.out.printf(RECORD, id, name, avgMarks);
        System.out.printf(LINE, "");
        System.out.printf(RECORD, 2, "Nuwan Ramindu", 62.2225);
        System.out.printf(LINE, "");
        
    }
}
