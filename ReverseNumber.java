public class ReverseNumber {
  public static void main(String[] args) {

    ReverseNumber rn = new ReverseNumber();
    rn.reverse(6543);

  }

  public void reverse(int num) {

    int rev = 0;
    ;
    while (num > 0) {
      int digit = num % 10;
      ;
      rev = rev * 10 + digit;
      num = num / 10;
    }
    System.out.println("Reversed Number is: " + rev);
  }

}
