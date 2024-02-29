package polymorphism;
class details{
    String name;
    int reg_no;
    details(String n,int a){
        this.name=n;
        this.reg_no=a;
    }
    public void display(){
        System.out.println("The name of the Employee   : "+name);
        System.out.println("The Reg_no of the Employee : "+reg_no);
    }
    static class company extends details{
        String roll;
        company(String n,int a,String r){
            super(n,a);
            this.roll=r;
        }
        public void display(){
            System.out.println("The name of the Employee   : "+name);
            System.out.println("The Reg_no of the Employee : "+reg_no);
            System.out.println("The Roll of the Employee   : "+roll);
        }
    }
}
public class employe {
    public static void main(String[] args) {
        details.company o=new details.company("Girish",14,"Developer");
        details.company d=new details.company("Harish",15,"Testing");
        o.display();
        System.out.println("-----------------------------------------------");
        d.display();
    }
}
