import java.util.*;
public class Testlists{

	//main method, strt of this program
	public static void main(String[] args){
	
		int num1 = 3;
		String word = "3";
		boolean b = true;
		char character = '3';
		double decimalNum = 3.3; 
		
		//implement array
		String[] names = {"John","Kayden","Alex","Sophie",
							"Benjy","Ethan"};	
	
		int[] listOfNum = {1, 85, 2, 3, 4};
			
		System.out.println(listOfNum[0]);
		System.out.println(listOfNum[1]);
		System.out.println(listOfNum[2]);
		System.out.println(listOfNum[3]);
		System.out.println(listOfNum[4]);
		
		listOfNum[1] = 2;
		
		for(int index = 0; index < listOfNum.length; index++){
			System.out.println(listOfNum[index]);
		}
		ArrayList<String> words = new ArrayList<>();
		words.add("pink");
		words.add("time");
		
		System.out.println(words.get(0));
	}
}
