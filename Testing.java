public class Testing {

	public static void main(String[] args) {

//creating array
	int[][] arr = new int[5][5];
	int rand;

//variable for random numbers
	rand = (int)(Math.random()* 100);
	arr[0][0] = rand;
for(int i = 0 ; i < 5; i++){
	for(int j = 0 ; j < 5 ; j++){
		rand = (int)(Math.random() * 100);
		arr[i][j] = rand;
		System.out.print (arr[i][j]);	
	}

	System.out.println();
}
//print out array
System.out.println(arr[0][0]);

										 }						
}