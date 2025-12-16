import java.util.Scanner;
public class demo2
{
public static void main (String[] args)
{
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter your name");
  String name=sc.nextLine();
  
  System.out.println("enter your age");
  int age=sc.nextInt();
  
  System.out.println("enter your status");
  boolean status=sc.nextBoolean();
  
  System.out.println("enter your height");
  double Height=sc.nextDouble();

  System.out.println("your name is"+name);
  System.out.println("your age is"+age);
  System.out.println("your status is"+status);
  System.out.println("your height is"+Height);
 }
}






