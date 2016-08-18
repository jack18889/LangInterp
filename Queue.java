package LangInterp;

/*
 * Queue[m][n] will store the parsed information from LangInterp.
 * The following queue is a dynamic queue which will double 
 * when full.
 * 
 * Queue will store the function in the Queue[m][] and
 * the parameters in Queue[m][n]. For parameterless functions,
 * column n will be as default null. 
 */

class Queue extends Thread{
	
	int putloc, getloc;
	
	String[][] Queue;
	
	// Default constructor for queue
	Queue() {
		Queue = new String[1][3];
	}
	
	
}
