import java.util.Scanner;
class student
{
    String sName;
    int rollNo;
    void input()
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter student name");
        sName=sc.nextLine();
        System.out.println("enter student rollno");
        rollNo=sc.nextInt();
        
    }
    void show()
    {
        System.out.println("student name is"+sName);
        System.out.println("studen rollno is"+rollNo);
    }
}
class result extends student
{
  double marks;
  void marks()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks out of 500");
    marks=sc.nextDouble();
  }
  void cal()
  {
    double percentage=(marks*100)/500;
  }
}




class main
{
public static void main(String[] args) {
    
}
}