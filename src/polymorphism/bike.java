package polymorphism;

public class bike {
    static class bikes extends bike {
        void bike_info() {
            System.out.println("These are bike information");
        }
    }
    static class yamaha extends bike{
        void yamaha_info(){
            System.out.println("Yamaha has VVA technology in R15");
        }
    }
    static class bajaj extends bike{
        void bajaj_info(){
            System.out.println("Bajaj has wide range of sports vehicle");
        }
    }
    static class revolt extends bike{
        void revolt_info(){
            System.out.println("Revolt is a E-vehicle based vehicle");
        }
    }
    static class bikes_info{
        public static void main(String[] args) {
            yamaha Y = new yamaha();
            bajaj B  = new bajaj();
            revolt R = new revolt();
            Y.yamaha_info();
            B.bajaj_info();
            R.revolt_info();
        }
    }
}
