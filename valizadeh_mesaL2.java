import java.util.*;
public class valizadeh_mesaL2 {
	static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
   {
	      System.out.print("Enter first string:");
	      String str1 = console.next();
	      System.out.print("Enter second string:");
	      String str2 = console.next();
	      if(str1.compareTo(str2) == 0)
	         System.out.println("The two stings are equal.");
	      if(str1.compareTo(str2) < 0)
	         System.out.println("The sting str1 < string str2.");
	      if(str1.compareTo(str2) > 0)
	         System.out.println("The sting str1 > string str2.");
	}
}
