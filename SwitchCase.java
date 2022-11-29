import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);


    System.out.println("press 1 for ADDITION");
    System.out.println("press 2 for SUBSTRATION");
    System.out.println("press 3 for DIVIDE");
    System.out.println("press 4 for MULTIPLICATION");

    System.out.print("Enter your Choice: ");
    int choice=scanner.nextInt();

    
    switch(choice){
        case 1:
            System.out.println("Enter first number");
            int first=scanner.nextInt();

            System.out.println("Enter the second number");
            int second=scanner.nextInt();
         
            int sum = first+second;
            System.out.println("ADDITON: " +sum);

        break;

        case 2:
            System.out.println("Enter first number");
            int f=scanner.nextInt();

            System.out.println("Enter the second number");
            int s=scanner.nextInt();
     
            int sub = f-s;
            System.out.println("SUBSTRACTION: " +sub);   
        break;
        
        case 3:
            System.out.println("Enter first number");
            float a=scanner.nextFloat();

            System.out.println("Enter the second number");
            float b=scanner.nextFloat();
     
            float div = a/b;
            System.out.println("DIVIDE: " +div);
        break;

        case 4:
            System.out.println("Enter first number");
            int fi=scanner.nextInt();

            System.out.println("Enter the second number");
            int se=scanner.nextInt();
     
            int mul = fi*se;
            System.out.println("MULTIPLICATION: " +mul);
        break;

        default:
        System.out.println("invalid option");
      
     }
     
     
        scanner.close();
    }
    
}
