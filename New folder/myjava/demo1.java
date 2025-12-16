import java.util.Scanner;
public class demo1
{
 public static void main(String[] args)
 {
   Scanner sc= new Scanner(System.in);  

   System.out.println("enter your name");
   String name=sc.nextLine();
   System.out.println("enter your age");
   int age=sc.nextInt();

   boolean status=false;
   double Height=8.9;

   System.out.println(name);
   System.out.println(age);
   System.out.print(status);
   System.out.println(Height);

   
 }
}