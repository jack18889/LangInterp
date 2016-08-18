package LangInterp;

/*
 * This a language interpreter for the basic assembly language.
 * The supported functionality can be found in support.java.
 * 
 * This program will import INPUT.TXT through bufferedreader
 * and parse the assembly instructions into Queue.
 * 
 * Queue will call to FunctionHandler to process the instructions
 * and print them onto the Stack.
 * 
 * Once 'quit' has been called, FunctionHandler will save the stack
 * into OUTPUT.txt.
 * 
 * To use the program LangInterp INPUT.TXT OUTPUT.TXT
 */

class LangInterp {

	public static void main(String[] args) {
		try {
			String inputFile = args[0];
			String outputFile = args[1];
			
			Parser Parser = new Parser(inputFile);
		} catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("To correctly use this program: ");
			System.out.println("LangInterp INPUT.TXT OUTPUT.TXT");
		}
		
	}

}
