public class NumberlLikePower {
    public static void main(String[] args) {
        int number = 2;
        int power = 3;
        System.out.println(power(number,power));

    }

    public static int power(int number, int power) {
        if (power == 0)
            return 1;
        else
          return    number * power(number, power - 1);
    }


}
