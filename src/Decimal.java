public class Decimal {
    public static void main(String[] args) {

        int n = 18;
        System.out.print("Binary Value of Decimal number is: " + DecimalToBinary(n));

    }

    static int DecimalToBinary(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 2 + 10 * DecimalToBinary(n / 2));
    }

}