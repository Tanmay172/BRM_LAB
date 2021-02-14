import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Number of lines you want to enter : ");
        int n = scan.nextInt();
        scan.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
         arr[i] = scan.nextLine();
        }
        for(int i=0;i<n;i++)
        {
         System.out.println(i+1 + " " + arr[i]);
        }
	}
}