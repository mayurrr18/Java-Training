public class Recursion{
    public static void main(String arg[]){
         m1(1);
    }
    private static  void m1(int a){
        if(a<=100){
                  System.out.println(a);
                   a++;
                   m1(a);
        }
    }
}