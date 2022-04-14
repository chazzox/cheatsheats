import java.util.Random;

class Exception {
  public static void main(String[] args){
	int[] arr = new int[] {1,2,3,4,5,6};
	Random r = new Random();
	int c = 0;
	while(c<10){
	  try {
		System.out.println(arr[r.nextInt(arr.length * 2)]);	
		c++;
	  }
	  catch(IndexOutOfBoundsException e){
		System.out.println("Exception thrown"); 
	  }
	}
  }
}
