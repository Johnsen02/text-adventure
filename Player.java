public class Player extends Human{

//attributess
	private String status;

//constructors 
	public Player(){
		this.status = "working";
}

//mutators
	public String getStatus(){
		return this.status;
}

	public void setStatus (String status){
		this.status = status;
}

//toString method
	public String toString(){
		return super.toString() + "----- I am bob";
}

}