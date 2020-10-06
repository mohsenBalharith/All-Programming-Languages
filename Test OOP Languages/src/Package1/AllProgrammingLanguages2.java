package Package1;

class AllProgrammingLanguages2 {
	 //* Main Methods */
	public static void main(String[] agrs){
	   //** Print The Name of The Designer of The Java Programming Language *// 
		AllProgrammingLanguages1 JavaDesign = new AllProgrammingLanguages1();
		System.out.println("The Java Programming Language Was Designed by: " + JavaDesign.getJavaDesign());
		
	   //** Print The Date on Which The Java Programming Language Was Established *//
	   AllProgrammingLanguages1 JavaWasEstablished = new AllProgrammingLanguages1();
      System.out.println("The Java Programming Language Was Established in: " + JavaWasEstablished.getJavaWasEstablished());
      
	   //** Print The Name of The Company That Developed The Java Programming language *//	
		AllProgrammingLanguages1 JavaDeveloper = new AllProgrammingLanguages1();
		System.out.println("The Java Programming Language Was Developed by: " + JavaDeveloper.getJavaDeveloper());
		
		//** Print The Name of The Designer of The Python Programming Language *//
		AllProgrammingLanguages1 PythonDesign = new AllProgrammingLanguages1();
		PythonDesign.setPythonDesign("Guido van Rossum");
		System.out.println("The Python Programming Language Was Designed by: " + PythonDesign.PythonDesign);
		
		//** Print The Date on Which The Python Programming Language Was Established *//
		AllProgrammingLanguages1 PythonWasEstablished = new AllProgrammingLanguages1();
		PythonWasEstablished.setPythonWasEstablished(1980);
		System.out.println("The Python Programming Language Was Established in: " + AllProgrammingLanguages1.PythonWasEstablished);
		
		//** Print The Name of The Company That Developed The Python Programming language *//
		AllProgrammingLanguages1 PythonDeveloper = new AllProgrammingLanguages1();
		PythonDeveloper.setPythonDeveloper("Python Software Foundation");
		System.out.println("The Python Programming Language Was Developed by: " + PythonDeveloper.PythonDeveloper);
	}
}

