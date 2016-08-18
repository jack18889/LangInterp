package LangInterp;

import java.io.*;

class Parser implements Runnable{
	String inputFile = "";
	
	Parser (String s){
		inputFile = s; 
	}
	
	public void run() {
		try(BufferedReader br = 
				new BufferedReader(new FileReader(inputFile))){
			
			Stack Stack = new Stack();
			Queue Queue = new Queue();
			FunctionHandler FH = new FunctionHandler();
			
			do{
				
			} while(br.readLine() != null);
		
			
		} catch(IOException exc){
			System.out.println("I/O Erorr: " + exc);
		}
		
	}
}
