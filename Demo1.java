public class Demo1{
    public static void main(String[] args) {

        double bankBal = 123456.7890;
        //we need to rounded about two decimal places with thousand grouping

        System.out.printf("BankBal=%,9.2f \n" ,bankBal);
    }
}