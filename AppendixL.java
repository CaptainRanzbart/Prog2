import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppendixL {
  public static void main(String[] args) {
    //Exercise 1
    IntStream stream = IntStream.of(2, -4, 10, 45, 99, 199, -5);
    int[] sorted1 = stream
        .map(x -> x > 0 ? x : -x)
        .toArray();

    //Exercise 2
    Stream<Locale> stream2 = Stream.of(Locale.getAvailableLocales());
    Object[] sorted2 = stream2
        .map(x -> x.getDisplayCountry())
        .distinct()
        .sorted(Comparator.comparing(String::toString).reversed())
        .toArray();
    for (Object x : sorted2) {
      System.out.println(x);
    }

    //Exercise 3
    Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
        .limit(92)
        .forEach(p -> System.out.println(p[0]));
  }
}
