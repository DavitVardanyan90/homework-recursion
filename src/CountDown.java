public class CountDown {
    public static void main(String[] args) {

        countNumber(3);

        System.out.println("0");
    }

    static void countNumber(int number) {

        if (number == 0)

            return;

        System.out.println(number);

        countNumber(number - 1);

    }
}