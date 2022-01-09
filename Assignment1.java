package jan6;
import java.util.*;
public class Assignment1 {
	// duplicate elements
	static String ShortenString(String str1)
	{
	  
	  Stack<Character> st = new Stack<Character>();
	 
	 
	  int i = 0;
	 
	  
	  while (i < str1.length())
	  {
	   
	    if (st.isEmpty() ||
	        str1.charAt(i) != st.peek())
	    {
	      st.add(str1.charAt(i));
	      i++;
	    }
	 
	   
	    else
	    {
	      st.pop();
	      i++;
	    }
	  }
	 
	  // If stack is empty
	  if (st.isEmpty())
	  {
	    return ("Empty String");
	  }
	 
	  // If stack is not Empty
	  else
	  {
	    String short_String = "";
	    while (!st.isEmpty())
	    {
	      short_String = st.peek() +
	                     short_String;
	      st.pop();
	    }
	    return (short_String);
	  }
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	  String str1 ="azzxzy";
	  System.out.print(ShortenString(str1));
	 
	}
	}
	 

	


