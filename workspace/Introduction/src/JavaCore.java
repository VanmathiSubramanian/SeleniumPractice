import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array
		//int[] array = new int[5];
		//System.out.println("The 5 natural numbers are :\n");
		//for(int i=0; i <= array.length; i++)
		//{
		///	array[i]=i;
		//	System.out.println(array[i]);
		
		//}
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Vanmathi");
		arr.add("mathi");
		arr.add("Madhan");
		arr.add("Jeju");	
		arr.add("Jaswin");
		//System.out.println(arr.get(3)+ " Is Jaswin");
		//System.out.println(arr.remove(1)+" is removed"); //to remove the value
		System.out.println("*****************");
		System.out.println(arr.contains("Jaswin"));
		for(int i = 0; i< arr.size(); i++) 
		{
			System.out.println(arr.get(i)); // to Retrieve the value we use get()
		}
		System.out.println("*****************");
		for(String val:arr)
		{
			System.out.println(val);
		}
		System.out.println("*****************");
		Boolean isNameFound = false; 
		for(int i = 0; i< arr.size(); i++) 
		{
			if(arr.get(i)== "lol")
			{
				System.out.println("True they present in Index of" +" "+ arr.indexOf("Jaswin"));
				isNameFound = true;
			}
		}
		if(!isNameFound) 
		{
			System.out.println("False name not found");
		}
		System.out.println("*****************");
		// array into arraylist
				int[] array = new int[5];
				List<int[]> Value = Arrays.asList(array);
				
				System.out.println("The 5 natural numbers are :\n");
				for(int i = 0; i < Value.size(); i++)
				{
					System.out.println(Value.size());
				}
		System.out.println("*****************");
		String name ="Vanmathi Madhan jaswin";
		// i want to split it as we split i will as array.
		String[] splited = name.split("Madhan"); // white spaces // will cut left and right part
		for(int i=0; i< splited.length;i++)
		{
			//System.out.println(splited[i]);
			System.out.println(splited[i].trim()); // compare both line it will trim white spaces
			System.out.println(name.charAt(i));
		}
		for(int i = name.length()-1; i>=0; i--)
		{
			System.out.println(name.charAt(i));
		}
	}

}
