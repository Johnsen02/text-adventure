/* this class runs the start of the program
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
	//tesing with main

public static void main(String[] args){

	Player player = Player();
		Human human1 =  new human("male", 2, 100);
		Human human2 =  new human("female", 3, 100);
//declare array of type parent class
	Human[] human = new Human[3];

//put each object into array
	human[0] = player;
	human[1] = human1;
	human[2] = human2;

//print out each obj in array
	System.out.println(human[0]);
	System.out.println(human[1]);
	System.out.println(human[2]);

//declare to start getting user input
	Scanner scanner = new Scanner(System.in);

	
//Prompt the user with a question to provide input
	System.out.println("Who are you");
	
	String  name = scanner.next();
	
	System.out.println("Hi " + name + "!");
	
	System.out.println("How old are you");
	
	int numberOfAge = scanner.nextInt():
	
	//declare a arraylist
ArrayList<Human> list = new ArrayList<>();

//initilazing a list of ants from user input
for(int i = 0; i < numberOfHuman; i++){
	list.add(new Human());
	list.get (i).setGender("male");
	list.get(i).setId(i);
}
System.out.println("Here is the amount of people in the game...");


	/*
	Person Bob = new Person();
	Bob.setName("Bob");
	System.out.println("Name of person:   " + Bob.getName());
	
	//call splash object
	Splash splash = new Splash();
	
		//call splash screen	
		splash.splashScreen();
		
		splash.the_endScreen();
		}
		/*
	}
		
		