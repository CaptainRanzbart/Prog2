public class AppendixB {
  public static void main(String[] args) {
    MathconstantsMain.main();
    PrinterQueue.PrinterQueueMain.main();
  }
}
//Exercise 1 -------------------------------------------------------------------------
class MathconstantsMain{
  public static void main(){
    System.out.println(MathConstants.PI);
  }
}
class MathConstants{
  static final double PI = 3.1415;
}
//Exercise 2/3 -------------------------------------------------------------------------
class PrinterQueue {
  private static final PrinterQueue INSTANCE = new PrinterQueue();
  private PrinterQueue() {
  }
  public void print(String input) {
    System.out.println("Printing Job: " + input);
  }
  public static PrinterQueue getInstance() {
    return INSTANCE;
  }

  class PrinterQueueMain {
    public static void main() {
      PrinterQueue q = PrinterQueue.getInstance();
      getInstance().print("Hello, Singleton!");
    }
  }
//Exercise 4 ------------------------------------------------------------
  class SearchAlgorithms{
    public static int[] bubbleSort(int[] input) {
      int[] arrayToSort = input;
      boolean swapped;
      int i;
      do{
      swapped = false;
      i = 0;
      while (i < arrayToSort.length - 1) {
        if(arrayToSort[i] > arrayToSort[i + 1]){
          var tmp = arrayToSort[i];
          arrayToSort[i] = arrayToSort[i + 1];
          arrayToSort[i + 1] = tmp;
          swapped = true;
        }
        i++;
      }
    }while(swapped = true);
      return arrayToSort;
    }
  }
}