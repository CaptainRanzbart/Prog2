public class AppendixD {
  public static void main(String[] args){
    BitVectorBase test = new BitVectorBase(0);
    System.out.println("Value: " + test.value);
    test.setBit(1, true);
    System.out.println("New Value: " + test.value);
    test.setBit(3, true);
    System.out.println("New Value: " + test.value);
  }
  public static class BitVectorBase{
    public long value;
    public BitVectorBase(){
      value = 0;
    }
    public BitVectorBase(long initialValue){
      value = initialValue;
    }
    public boolean isSet(int bit){
      if(bit > 63 || bit < 0){
        throw new IllegalArgumentException();
      }
      return (value & bit) == bit;
    }
    public boolean equals(BitVectorBase obj){
      return obj.value == value;
    }
    public int hashCode(){
      return (int)value;
    }
    public void setBit(int bit, boolean valueIn){
      if(bit > 63 || bit < 0){
        throw new IllegalArgumentException();
      }
      if(valueIn){
        value = value | bit;
      }else{
        value = value & ~(int)(Math.pow(2, (bit - 1)));
      }
    }
  }
}
