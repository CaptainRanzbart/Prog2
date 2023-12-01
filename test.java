import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;


public class test {
  public static void main(String[] args){
    for(int a = 0; a <= 1000; a++){
      for (int b = a + 1; b <= 1000; b++){
        int c = 1000 - a - b;
        if((Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c) && c > b){
          System.out.println("" + a + ", " + b + ", " + c);
          System.out.println(a*b*c);
        }
      }
    }
  }
}
