class test_soal1 {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 4, 3, 10, 11, 20, 5, 100, 200 };

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 5) {
        System.out.println("Fizz");
      }
      if (numbers[i] == 11) {
        System.out.println("Buzz");
      }
      if (numbers[i] == 5 && numbers[i] == 11) {
        System.out.println("FizzBuzz");
      }
    }
  }
}
