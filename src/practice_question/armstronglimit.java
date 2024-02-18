package practice_question;

public class armstronglimit {
    public static void main(String args[]){
        int rem,i,res=0;
        for(i=100;i<=999;i++){
            rem=i%10;
            res+=Math.pow(rem,3);//not done
            i/=10;
        }
        if(res==i)
            System.out.println(" "+res);
    }
}
