public class Encapsulation {
   private int id;
   
   public void setId(int id) {
       this.id = id;
   }
   
   public int getId() {
       return id;
   }
   
   void display(){
    System.out.println("your data is added");
   }
   public static void main (String[]args){
    Encapsulation std1= new Encapsulation();
    std1.setId(45);
    System.out.println("studentid"+std1.getId());
    std1.display();
    StudentDetail std2=new StudentDetail();
    std2.setResult(99);
    System.out.println("Result"+std2.getResult());
    std2.Result();


   }
}
