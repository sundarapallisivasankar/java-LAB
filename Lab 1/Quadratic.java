import java.util.Scanner;
public class roots{

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value c: ");
        int c = sc.nextInt();
        double d =(b*b)-(4*a*c);
        double r1,r2;
        if(d>0)
        {
        	System.out.print("Roots are real and different");
        	r1=(-b+Math.sqrt(d))/(2*a);
        	r2=(-b-Math.sqrt(d))/(2*a);
        	System.out.println("Root 1:"+r1);
        	System.out.println("Root 2:"+r2);
        }
        else if(d==0)
        {
        	System.out.println("Roots are real and equal");
        	r1=(-b)/(2*a);
        	r2=(-b)/(2*a);
        	System.out.println("Root 1:"+r1);
        	System.out.println("Root 2:"+r2);        
        }
        else
        {
        	System.out.println("Roots are complex");
        	
        }
        	
        	

    }
}
