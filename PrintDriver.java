
package test;
/*This is an application for singleton I used this design pattern to control the printing process. 
It is only one object can create from this class in order to control the printing process in Queue 
so that no errors occur and I don't consume resources.*/
public class PrintDriver {
    private static PrintDriver UniqeInstance;
    //I made the constructor private to prevent access to it outside the class
    private PrintDriver(){
        
    }
    //to make only one instance
    public static PrintDriver getInstance(){
        if(UniqeInstance==null){
            UniqeInstance = new PrintDriver();//lazy intilization create when request
                
        }
      return  UniqeInstance ;
    }
}
