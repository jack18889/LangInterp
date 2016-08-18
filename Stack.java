package LangInterp;

/** 
 * Creates a private Stack array that holds the Output.
 * Stack can be called by the methods:
 *  
 *  addToStack();
 *  changeTopOfStack();
 *  removeFromStack();
 *  printStack();
 *  saveStack();
*/

class Stack {
	
	private String[] Stack;
	public int sL = Stack.length;
	
	Stack () {
		Stack = new String[1];
	}
	
	// Increase the size of the stack by 1.
	void increaseSize() {
		String[] newStack = new String[sL+1];
		for(int i = 0; i < sL; i++)
			newStack[i+1] = Stack[i];
		Stack = newStack;
	}
	
	void addToStack(FunctionHandler ob) {
		
	}
	
	void changeTopOfStack() {
		
	}
	
	void removeFromStack() {
		
	}
	
	void printStack() {
		
	}
	
	void saveStack() {
		
	}
}
