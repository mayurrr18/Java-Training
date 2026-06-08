//take number which has only 5 integer number in count  between 100 and 200
public class numberof5 {
    public static void main(String[] args) {
        for(int i=100;i<=200;i++){
            int count=0;
            int num=i;
            int rem=0;
            while(num>0){
             rem=num%10;
             if(rem==5)
                {
                  count++;
                             }  
                num=num/10;
            }
            if(count==1){
                System.out.println(i);
            }
     }
       
    }
    }

