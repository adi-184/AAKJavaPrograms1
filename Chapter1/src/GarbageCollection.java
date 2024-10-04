package chapterno1;

public class GarbageCollection {
	String objRef;
	   public GarbageCollection(String objRef)
	   {
	      this.objRef = objRef;
	   }

	public static void main(String[] args) {
		new GarbageCollection("t1"); // Anonymous object creation. 
		// Invoking garbage collection.
		   System.gc();
		}
		@Override
		/* Overriding finalize method to check whether anonymous object is garbage collected or not. */
		protected void finalize() throws Throwable 
		{	
		    System.out.println(this.objRef+" is successfully garbage collected.");
		 }
		}