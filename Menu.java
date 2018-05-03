/*
Author: John
Last Edit: Sept 14
*/
	
	public class Menu {
	
	public Menu(){
			
		}
	public void selection(int option){
	
		switch(option){
		case 1:
			System.out.println(" You wake up and start questioning your existance. You overhear farmers talking about a shaman that knows everything. A farmer walks in and sees you!");
			break;
			
		case 2:
		   //exit
			break;
		default:
			//default here
			break;
		}
	}
	//draws the menu
	public void drawMenu(){
	System.out.println(" Menu ");
	System.out.println(" 1 - Play ");
	System.out.println(" 2 - Exit  ");
	System.out.println(" Choose an option");
	}
	
	
	}
