import javax.naming.ldap.SortControl;

public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
	  String str= "Sammarth";
	  String res="";
	 
	  for(int i=0;i<str.length();i++)
	  {
		 char ch=str.charAt(i);
	  if(res.indexOf(ch)==-1) 
	   {
		 res=res+ch;
	   
	   }
	  }
	System.out.println("Original String:"+str);
	System.out.println("String after removing duplicates:"+res);
    }
}

