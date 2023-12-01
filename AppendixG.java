public class AppendixG {
  public enum CarBrand{
    AUDI,
    BMW,
    FORD,
    TOYOTA,
    RENAULT
  }
  public class CarBrandDemo{
    public void printName(CarBrand x){
      System.out.println(CarBrand.valueOf(String.valueOf(x)));
    }
    public CarBrand fromName(String x){
      return CarBrand.valueOf(x);
    }

  }
}
