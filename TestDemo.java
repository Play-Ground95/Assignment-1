public class TestDemo {

  
    public static void main(String[] args) {
        
        String text = "Colored Background";

        System.out.println("Using printf with ANSI escape codes:");
        System.out.printf("\u001B[41;37m %s \u001B[0m%n", text); // Red background, white text
        System.out.printf("\u001B[42;30m %s \u001B[0m%n", text); // Green background, black text
        System.out.printf("\u001B[43;34m %s \u001B[0m%n", text); // Yellow background, blue text
    }
}
