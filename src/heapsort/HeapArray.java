package heapsort;

public class HeapArray <T extends Comparable<T>>{

	private T[] list; //Stores the list of numbers in the heap
	private int lastItem; //Tracks the numbers in the array
	
	private String log;
	
	public HeapArray(){
		list = null;
		lastItem = 0;
		log = null;
	}
	
	public HeapArray(T[] inputList){
		list = inputList;
		lastItem = inputList.length-1;
		log = "";
	}
	
	public String outputHeap(){
	//	while(lastItem>0){
			
	//	}
		log += toString();
		return log;
	}
	
	private int heapifyRecurse(int index){
		
		
	}
	
	private void heapify()
	
	private void swap(){
		T temp = list[0];
		list[0] = list[lastItem];
		list[lastItem] = temp;
		lastItem--;	
	}
	public String toString(){
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
	
}
