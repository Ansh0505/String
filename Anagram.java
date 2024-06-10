import java.util.Arrays;
public class Anagram
{
  public static void main(String[] args) 
  {
	  String str1="the classroom";
	  String str2="school master";
	  
	  str1=str1.replace(" ","");
	  str2=str2.replace(" ","");
	  char arr1[]=str1.toCharArray();
	  char arr2[]=str2.toCharArray();
	  Arrays.sort(arr1);
	  Arrays.sort(arr1);
	  System.out.println(arr1);
	  System.out.println(arr2);
	  if(Arrays.equals(arr1,arr2))
	  {
		  System.out.println("it's an anagram");
	  }
	  else {
		System.out.println("not an anagram");
		
	}
	  
  }

}
