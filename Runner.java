/* this class runs the start of the program
*/

public class Runner {
	//tesing with main

public static void main(String[] args){

	Player player = Player();
		Human human1 =  new human("male", 2, 100);
		Human human2 =  new human("female", 3, 100);
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
		/*
	}
		
		