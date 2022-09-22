import java.util.*;
class employee
{
    
    String eName;
    int empId;
    double sal;
    employee()
    {
        eName="gavaskar";
        empId=104;
        sal=1000.0;
    }
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter employee name");
        eName=sc.nextLine();
        System.out.println("enter employee id");
        empId=sc.nextInt();
        System.out.println("enter employee salary");
        sal=sc.nextDouble();
    }
    void show()
    {
        System.out.println(" employee name is"+eName);
        System.out.println(" employee id is"+empId);
        System.out.println(" employee salary is"+sal);
    }
}
 

class Main{
public static void main(String[] args) {
    employee e1= new employee();
    e1.input();
    e1.show();

}
}