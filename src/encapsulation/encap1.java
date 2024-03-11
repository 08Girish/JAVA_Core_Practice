package encapsulation;
class Car{
    private String model;
    private int price;
    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public int getprice(){
        return price;
    }
    public void setPrice(int price){
       this.price = price ;
    }
}
public class encap1 {
    public static void main(String[] args) {
        Car s = new Car();
        s.setmodel("AUDI R8");
        s.setPrice(40000000);
        System.out.println(s.getmodel()+":"+s.getprice());
    }
}
