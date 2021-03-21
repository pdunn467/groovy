class Example { 
   static void main(String[] args) { 
      // Initializing a local variable 
      String prod = "false";
      String os = "RHEL7"; 
      String type = "patch";
      String date = "Date"; 
		
      //Check for the boolean condition 
      if (prod == 'false') { 
         //If the condition is true print the following statement 
         buildname = "test-" + os + "-" + type;
         println(buildname); 
      } else { 
         //If the condition is false print the following statement 
         buildname = "test-CDE-" + os + "-" + type;
         println(buildname); 
      } 
   } 
}
