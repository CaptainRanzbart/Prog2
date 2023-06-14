import java.util.*;

public class AppendixF {
  public static void main(String[] args){
    LinkedList<Integer> a = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9));
    LinkedList<Integer> b = new LinkedList<Integer>(Arrays.asList(2,4,6,8));

    System.out.println(MergeQueues.merge(a, b));
  }
  public class MergeQueues{
    public static <T extends Comparable<T>> Queue<T> merge(Queue<T> a, Queue<T> b){
      Queue<T> c = new LinkedList<>();
        while (!a.isEmpty() && !b.isEmpty()){
            c.add(a.peek().compareTo(b.peek()) > 0 ? b.remove() : a.remove());
        }
      return c;
    }
  }
  public class Stack<E>{
    ArrayList<E> list = new ArrayList<>();
    int capacity = 0;
    void push(E data){
      if(list.size() >= capacity) throw new StackOverflowError();
      list.add(data);
    }
    E pop(){
      if(list.size() == 0) throw new EmptyStackException();
      return list.remove(list.size() - 1);
    }
    E peek(){
      return list.get(list.size() - 1);
    }
    int getCapacity(){
      return list.size();
    }


  }
  public class SequentialSearch{
    public final static int ELEMENT_NOT_FOUND = -1;

    public static <T extends Comparable<T>> int sequentialSearch(T[] f, T k){
      int index = ELEMENT_NOT_FOUND;
      for (int i = 0; i < f.length; i++) {
        if(f[i].compareTo(k) == 0) index = i;
      }
      return index;
    }
  }
}
