import java.util.*;

public class EmployeSalary {
    double basicPay ,hra ,da,pf,grossSalary,netSalary;
      

     void accept(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        basicPay=sc.nextDouble();
     }
     
     void calculateSalary(){
        hra =0.15 * basicPay;
        da = 0.10* basicPay;
        pf = 0.06 * basicPay;
        grossSalary = basicPay + hra + da;
        netSalary = grossSalary - pf;
    }
      void display(){
        System.out.println("gross salary :"+grossSalary);
        System.out.println("netsalary :"+netSalary);

      }
      public static void main(String[] args) {
        EmployeSalary Emp= new EmployeSalary();
        Emp.accept();
        Emp.calculateSalary();
        Emp.display();
      }
   }
