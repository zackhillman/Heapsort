package heapsort;

import javax.swing.*;
import BreezySwing.*;

public class HeapGUI extends GBFrame{

	private JLabel inputL; //Tells the user where to input
	private JTextField inputF;//Allows the user to input numbers
	private JButton outputArray; //Heapifys the numbers using an array
	private JButton outputTree;//Heapifys the numbers using a tree
	private JButton reset; //Resets the program
	private JTextArea output; //Where the numbers are outputted
	private HeapArray heap;
	
	/**
	 * This is the constructor method. The GUI objects are instantiated.
	 */
	public HeapGUI(){
		inputL = addLabel("Input:",1,1,3,1);
		inputF = addTextField("",2,1,3,1);
		outputArray = addButton("Output (Array)",3,1,1,1);
		outputTree = addButton("Output (Tree)",3,2,1,1);
		reset = addButton("Reset",3,3,1,1);
		output = addTextArea("",4,1,3,1);
		setVisible(true);
		setSize(400,300);

		
	}
	/**
	 * This method is called when a button is clicked
	 */
	public void buttonClicked(JButton buttonObj){
		if(buttonObj == outputArray){
			heap = new HeapArray(inputF.getText().split(","));
			output.setText(heap.outputHeap());
		}else if(buttonObj == outputTree){
			
		}else if(buttonObj == reset){
			this.dispose();
			new HeapGUI();	
		}
	}
	
	/**
	 * This is the main method it creates the actual GUI
	 * @param args
	 */
	public static void main(String[] args) {
		HeapGUI theGUI = new HeapGUI();
	}
}
