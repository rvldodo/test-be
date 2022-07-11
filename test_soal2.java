class test_soal2 {

    public static void main(String[] args) {
      String[] arrayString = { "ka", "wah", "1772", "edukasi" };
      int[] arrayNumbers = { 1, 67, 7, 98, -1 };
  
      for (int i = 0; i < arrayString.length; i++) {
        System.out.println(
          "index ke " + i + " adalah string dengan data " + arrayString[i]
        );
      }
      for (int i = 0; i < arrayNumbers.length; i++) {
        if (arrayNumbers[i] > 0) {
          System.out.println(
            "index ke " + i + " adalah integer dengan data " + arrayNumbers[i]
          );
        } else {
          System.out.println("index ke " + i + " tidak bisa divalidasi");
        }
      }
    }
  }
  