/* this class runs the start of the program
*/
 import java.util.Scanner;

public class Runner {
	//tesing with main
public static void main(String[] args){
	
	//declare menu objects
	Menu menu = new Menu(); 
	
	//set up user input
	Scanner input = new Scanner(System.in);
	int option; //will hold user input for menu option
	
	//loop through menu till user enters in 5
	do{
		//draw menu
		menu.drawMenu();
		
		//get user input
		option =  input.nextInt();
		menu.selection(option);
		
	}while(option != 5);
	
	
	Player player = new Player();
		Human human1 =  new Human("male", 2, 100);
		Human human2 =  new Human("female", 3, 100);
//declare array of type parent class
	Human[] human = new Human[3];

//put eeach object into array
	human[0] = player;
	human[1] = human1;
	human[2] = human2;

//print out each obj in array
	System.out.println(human[0]);
	System.out.println(human[1]);
	System.out.println(human[2]);

	
	
	
	
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
		*/
	}
}
	