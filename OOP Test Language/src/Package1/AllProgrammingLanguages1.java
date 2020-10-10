package Package1;


public class AllProgrammingLanguages1 {
 //** The Name of The Designer of The Java Programming Language *//
	private String JavaDesign = "James Gosling";
	
//** The Date on Which The Java Programming Language Was Established *//	
	private static int JavaWasEstablished = 1995;
	
//** The Name of The Company That Developed The Java Programming language *//	
	private String JavaDeveloper = "Oracle Corportion";
	
//** The Name of The Designer of The Python Programming Language *//	
    public String PythonDesign = "Guido van Rossum";
    
//** The Date on Which The Python Programming Language Was Established *//
    static int PythonWasEstablished = 1980;
    
//** The Name of The Company That Developed The Python Programming language *//
    public String PythonDeveloper = "Python Software Foundation";

//** Create Object 1 *//    
public AllProgrammingLanguages1(String newJavaDesign, String JavaDesign,
		                        int newJavaWasEstablished, int JavaWasEstablished, 
		                        String newJavaDeveloper, String JavaDeveloper) {
		
	}

//** Create Object 2 *//
public AllProgrammingLanguages1(String newPythonDesing, int newPythonWasEstablished, String newPythonDeveloper) {
	
   }

//** Set a new Java Developer *// This is (setJavaDesign) is private ,and The other class could not use it
   private void setJavaDesign(String newJavaDeveloper){
	   JavaDesign = newJavaDeveloper;
   }
   
//** Return JavaDesign *//   
   public String getJavaDesign() {
    	return JavaDesign;
   }
   
//** Set a new Java Was Established *// This is (setJavaWasEstablished) is private ,and The other class could not use it  
   private void setJavaWasEstablished(int newJavaWasEstablished) {
	   JavaWasEstablished = newJavaWasEstablished;
   }
   
//** Return JavaWasEstablished *//     
   public int getJavaWasEstablished() {
	   return JavaWasEstablished;
   }
   
//** Set a new Java Developer *// This is (setJavaDeveloper) is private ,and The other class could not use it  
   private void setJavaDeveloper(String newJavaDeveloper) {
	   JavaDeveloper = newJavaDeveloper;
   }
   
//** Return JavaDeveloper *//   
   public String getJavaDeveloper() {
	   return JavaDeveloper;
   }
   
//** Set a new Python Design *//   
   public void setPythonDesign(String newPythonDesign){
	   PythonDesign = newPythonDesign;
   }
   
//** Set a new Python Was Established *//   
   void setPythonWasEstablished(int newPythonWasEstablished){
	   PythonWasEstablished = newPythonWasEstablished;
   }
   
//** Set a new Python Developer *//   
   public void setPythonDeveloper(String newPythonDeveloper) {
	   PythonDeveloper = newPythonDeveloper;
   }

}
