package practice.divya;

public class StringOperators {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//length()-to find the length of a string
		/*String str="hello";
		//System.out.println("hello".length());
		System.out.println(str.length());
	System.out.println(str.charAt(1));
	System.out.println(str+"world");
}}*/

		
		/*String str="hello";
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}*/
		
		
		String str=" WOR LD ";
System.out.println(str.concat("world"));

System.out.println(str.substring(1,3));
System.out.println(str.trim());
//System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
System.out.println(str.startsWith(" "));
System.out.println(str.contains("W"));
System.out.println(str.lastIndexOf(""));


}}


