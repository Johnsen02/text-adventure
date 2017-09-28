/* 
Author: John
Last edit: spet 28 2017
*/

Public class Person{

	//declaring attributes
	private String name;
	private int age;
	private String gender;
	
	//zero argument constructor
	public Person(){
		this.age = 19;	
	}
	
	//loaded constructor
	public Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//getters and setters for attributes
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getGender(){
		return this.gender
	}
	
	
	public void setName(String name){
		this.name = name;	
	}
	
	


		}