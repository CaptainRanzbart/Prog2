public class AppendixE{
  public static void main(String[] args){
    Float[] arrf = {(float)1,(float)2,(float)3,(float)4};
    Integer[] arri = {0,1,2,3,4,5,6,7};
    Double[] arrd = {(double)0, (double)1,(double)2,(double)3,(double)4};
    Object[] arr = {" ", 0, null, 0.12 };
    System.out.println(countNumberTypes(arr));
  }
  public static <T> int countNumberTypes(T[] arr){
    int count = 0;
    for (T x: arr) {
      if(x != null) {
        if (x instanceof Number) count++;
      }
      }
    return count;
  }
  public static <T extends  Comparable<T>> T findBiggest(T[] array){
    T currentbiggest = array[0];
    for(int i = 0; i < array.length; i++){
      if(array[i].compareTo(currentbiggest) > 0){
        currentbiggest = array[i];
      }
    }
    return currentbiggest;
  }
  public static <T extends Comparable<T>> int countPrimeNumbers(T[] array, T[] prime){
    int count = 0;
    for (T x: array ) {
      for (T y: prime ) {
        if(x.compareTo(y) == 0) count++;
      }
    }
    return count;
  }
  public static <K ,V> Pair findbiggestPair(Pair[] arr){
    Pair p = arr[0];
    for(Pair x : arr){
      if(x.value.compareTo(p.value) > 0) p = x;
    }
    return p;
  }
  public class Pair <K extends Comparable<K>, V extends Comparable>{
    private K key;
    private V value;

    public K getKey() {
      return key;
    }

    public void setKey(K key) {
      this.key = key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
    public Pair(K key, V value){
      this.setKey(key);
      this.setValue(value);
    }
  }
}
