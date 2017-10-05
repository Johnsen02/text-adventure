public class Human{

//attributes
	private String gender;
	private int id;
	private int health;
	private boolean isAlive;

//constructive
	public Human(){
		this.health = 100;
		this.isAlive = true;
}

	public Human(String gender, int id, int health){
		this.gender = gender;
		this.id = id;
		this.health = health;
		this.isAlive = true;
}
//mutators
	public int getName(){
		return this.name;
}
	public void setName(int id){
		this.name = id;
}
//other mutators

//toString
public string toString(){
return "Human name: " + this.id + " health: " + this.health + " isAlive: " +this.isAlive
 + " gender: " + this.gender ;

}
				}
