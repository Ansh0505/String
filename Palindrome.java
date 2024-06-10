public class Palindrome 
{
	public static void main(String[] args)
	{
		String str="123321";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		 if(str.equals(rev))
		 {
			 System.out.println("it's a palindrome");
		 }
		 else
		 {
          System.out.println("it's not a palindrome");
		 } 	
	  }
}
