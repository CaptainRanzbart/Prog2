public class AppendixC {
  public static void main(String[] args){
    CatchingExceptions.catchExceptions(1);
  }
}

//Exercise 2 ---------------------------------------------------------------------
class CatchingExceptions {
  private static int erroneousMethod(int p) {
    if (p == 0) {
      throw new IllegalArgumentException();
    }
    int x = 0x01;
    return p / (x >> Math.abs(p));
  }

  public static void catchExceptions(int passthrough) {

    try {

      erroneousMethod(passthrough);
    } catch (IllegalArgumentException e) {
      System.out.println("exception catched");
    }catch (ArithmeticException e){
      System.out.println("exception catched");
    }
  }
  //Excercise 3 ----------------------------------------------------------------------

   public class FactorialWithException {

     public static long factorial(long n) {
       if(n < 0){
         throw new ArgumentNegativeException();
       }

       return 0 == n ? 1 : n * factorial(n - 1);
       }

     public static void main(String[] args){
       try {
         factorial(-1);
         } catch (ArgumentNegativeException e) {
         e.printStackTrace();
         }
       }
        public static class ArgumentNegativeException extends RuntimeException {
          public ArgumentNegativeException(){

          }
          public ArgumentNegativeException(String message){

          }
          public ArgumentNegativeException(String message, Throwable cause){

          }
     }
 }
}
