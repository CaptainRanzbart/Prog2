public class AppendixA {
  public static void main(String[] args) {

    //findnumbers(1000);
    //System.out.println(palindrome());
    //largestproduct();
    pythagorean();
    //smallestmultiple(20);
    //powerdigitsum();
  }

  //All dividable by 3 or 5-------------------------------------------------------------------

  public static void findnumbers(int max) {
    int sum = 0;
    int currentnumbers = 0;
    for (int i = 0; i <= max; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        currentnumbers++;
        System.out.print(i + ", ");
        sum = sum + i;

        if (currentnumbers > 19) {
          System.out.println();
          currentnumbers = 0;
        }

      }
    }
    System.out.println();
    System.out.println("Sum: " + sum);
  }

  ;

  //Largest Palindrome Product of three digit Numbers----------------------------
  public static int palindrome() {
    int currentbiggest = 0;
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 1000; j++) {
        int product = i * j;
        if (product > currentbiggest && ispalindrome(product)) {
          currentbiggest = product;
          System.out.println("Current biggest: " + currentbiggest);
        }
      }
    }
    return currentbiggest;
  }

  ;

  public static boolean ispalindrome(int in) {
    int n = in;
    int r, sum = 0;
    while (n > 0) {
      r = n % 10;
      sum = (sum * 10) + r;
      n = n / 10;
    }
    return in == sum;
  }

  ;

  //Find largest Product out of Series of digits---------------------------------------
  public static void largestproduct() {
    double currentbiggest = 0;
    double currentbiggestsposition = 0;
    String input = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    int size = input.length();
    char[] arr = input.toCharArray();
    int[] intarr = new int[size];
    for (int i = 0; i < size; i++) {
      intarr[i] = Character.getNumericValue(arr[i]);
    }
    for (int n = 0; n < size - 13; n++) {
      double sum = 1;
      for (int j = 0; j < 13; j++) {
        sum *= intarr[n + j];
      }
      if (sum > currentbiggest) {
        currentbiggest = sum;
        currentbiggestsposition = n;
      }
    }
    System.out.println("Biggest Number is: " + currentbiggest + " at the position " + (int) currentbiggestsposition);
    System.out.print("With the Numbers: ");
    for (int i = 0; i < 13; i++) {
      System.out.print(intarr[(int) currentbiggestsposition + i]);
    }
  }

  ;

  //Pythagorean Triple------------------------------------------------------------------
  public static int pythagorean() {
    double a, b, c;
    for (a = 1; a <= 1000; a++) {
      for (b = a + 1; b <= 1000; b++) {
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if ((a + b + c) == 1000) {
          System.out.println("A: " + a);
          System.out.println("B: " + b);
          System.out.println("C: " + c);
          System.out.println("Value: " + (a * b * c));
        }
      }
    }
    return 1;
  }

  ;

  //Smallest Multiple----------------------------------------------------------------------
  public static void smallestmultiple(int y) {
    double x = 1;
    boolean accepted = true;
    while (accepted) {
      System.out.println("Trying " + x + " ...");
      accepted = false;
      for (int i = 1; i <= y; i++) {
        if (x % i != 0) {
          accepted = true;
        }
      }
      x++;
    }
    x--;
    System.out.println(x);
    return;
  }

  ;
}