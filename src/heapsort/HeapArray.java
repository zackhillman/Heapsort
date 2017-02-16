package heapsort;

public class HeapArray <T extends Comparable<T>>{

	private T[] list; //Stores the list of numbers in the heap
	private int lastItem; //Tracks the numbers in the array
	
	private String log; //Tracks every time heap is made or swap is made
	
	/**
	 * This the the default constructor.
	 * The instance variables are set to 0 or null
	 */
	public HeapArray(){
		list = null;
		lastItem = 0;
		log = null;
	}
	
	/**
	 * This is another constructor. The instance
	 * variables are instantiated
	 * @param inputList- the list of Ts that need to be sorted
	 */
	public HeapArray(T[] inputList){
		list = inputList;
		lastItem = inputList.length-1;
		log = "";
	}
	
	/**
	 * This is the primary method. It outputs the log and sorts
	 * the list of numbers.
	 * @return- the Log of each heap creation and swap. And finally
	 * the sorted Ts
	 */
	public String outputHeap(){
		log += printLevels()+"\n\n----\n\n";
		heapify();
		log+= "Sorted: " + toString();
		return log;
	}
	
	/**
	 * This method takes an index and makes sub tree a heap. 
	 * @param index- the index of the parent
	 * @return- true if a swap was made
	 * 			false- if no swap was made
	 */
	private boolean heapifySubTree(int index){
		int odd = 2*index+1;
		int even = 2*index+2;
		
		int max = index;
		
		 if (odd <= lastItem && list[odd].compareTo(list[index])>0){
			 max = odd;
			 
		 }
		
	     if (even <= lastItem && list[even].compareTo( list[max])>0)        
	    	 max = even;
	 
	     if(max!=index){
	    	 swap(index,max);
	    	 return true;
	     }
	     return false;
		
		
	}
	
	/**
	 * This method turns the list into a heap.
	 */
	private void heapify(){
		while(lastItem>=0){
			boolean repeat = true;
			while(repeat){
				repeat = false;
				for(int i = 0;i<lastItem;i++){
					 if(heapifySubTree(i)){
						 repeat = true;
					 }
				}
			}
			log+=printLevels()+"\n\n";
			swap(lastItem,0);
			lastItem--;
			log+=printLevels()+"\n\n----\n\n";
			
		}
	}
	
	/**
	 * This method swaps the value of two different indexes
	 * @param i1- one of the indexes to swap
	 * @param i2- the second of two indexes to swap
	 */
	private void swap(int i1, int i2){
		T temp = list[i1];
		list[i1] = list[i2];
		list[i2] = temp;
	}
	
	/**
	 * This method prints out the different levels of the heap
	 * @return- each Level on a new line and Ts accordingly
	 */
	private String printLevels(){
		String output = "";
		int level = 0;
		for(int i = 0;i<list.length;i++){
			if(i>Math.pow(2, level)-2){
				level++;
				output += "\n";
				output += "Level "+ level + ": ";
			}
			output+=list[i]+ " ";
		}
		return output.trim();
	}
	
	/**
	 * This method prints out the list
	 * @return- the list in String form
	 */
	public String toString(){
		String output = "";
		for(T t : list){
			output+= t + " ";
		}
		return output;
	}
	
}
