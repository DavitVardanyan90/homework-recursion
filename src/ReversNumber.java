public class ReversNumber {
    public static void main(String[] args) {


        int rev = 123456789;
        System.out.println("num : " + rev);
        System.out.print("revers number: ");
        reversNUmber(rev);

    }

   public static void reversNUmber(int rev) {

        if (rev < 10) {
            System.out.println(rev);
            return;
        }
            else {
            System.out.print(rev % 10);
            reversNUmber(rev / 10);
        }
    }
}
