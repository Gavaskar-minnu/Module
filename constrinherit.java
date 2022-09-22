import java.util.Scanner;
import java.util.jar.Attributes.Name;

 


class Student{

 

    String Name;
    int Age,id;
     Student()
     {
         Name="asha";
         Age=21;
         id=101;
         System.out.println("Student class constr......is calling...");
     }
     Student(String nm, int a, int i)
     {
         
       Name=nm;
       Age=a;
       id=i;
         
     }
     
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        Name = sc.nextLine();
        System.out.println("Enter your Age");
        Age = sc.nextInt();
        System.out.println("Enter your Id");
        id = sc.nextInt();

 

    }
    void show(){
        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
        System.out.println("id : "+id);
    }

 


}

 

class Result extends Student{

 

    Double marks;
    Result()
    {
        marks=600.9;
        System.out.println("Result class cons.....call.....");
    }
    Result(Double m,inr)
    {
           
        marks=m;
    }
    void Marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Marks out of 1000");
        marks = sc.nextDouble() ;
    }
    void cal(){
        Double percentage = (marks * 100)/1000;
        System.out.println("Percentage = "+percentage);
    }

 

}

 


class Main {
    public static void main(String[] args) {
        Result r = new Result(9999.9);
          
      

    }
    
}