
public class BinarySearch {

	public static void main(String[] args) {
		int []arr = {2, 5, 7, 9, 16, 27, 69};
	    int x = 7;
	    System.out.println("Key was found at position " + (find(x, arr)) + " in the array");
	  }
	
	  public static int find (int searchKey, int []myArray){
	    int lower = 0;//set lower to the first position in the array
	    int upper = (myArray.length) - 1;//set upper to the last element in the array
	    int check = 0;
	    
	    while (lower <= upper){
	      check = (lower + upper)/2;//divide the array in two
	      if (myArray[check] == searchKey){//if the middle element matches the key we are looking for 
	        return check;//return the element in the array
	      }
	      
	      else if(lower > upper){//if we don't find the key
	        return -1;//-1 means it was not found
	      }
	      
	      else{
	        
	        if(myArray[check] < searchKey){//if the middle element is less than the number we are looking for
	          lower = check + 1;//change the value of lower to start at the start of the upper section
	        }
	        else{
	          upper = check -1;//else set upper to start at the end of the lower section
	          
	        }
	      }
	    }return check;
	  }

	}

