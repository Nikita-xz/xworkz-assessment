ENCAPSULATION

We hide the data members. Using access specifier we achieve encapsulation.

Eg:
public class Encapsulate 
{ 
    
    private String displayName; 
    private int displayRoll; 
    private int displayAge; 
	public int getAge()  
    { 
      return displayAge; 
    } 
    public String getName()  
    { 
      return displayName; 
    } 
    public int getRoll()  
    { 
       return displayRoll; 
	   }
    public void setAge( int newAge) 
    { 
      diplayAge = newAge; 
    }
    public void setName(String newName) 
    { 
      diplayName = newName; 
    }
    public void setRoll( int newRoll)  
    { 
      diplayRoll = newRoll; 
    } 
} 




public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate value = new Encapsulate(); 
          
        
        value.setName("Harsh"); 
        value.setAge(19); 
        value.setRoll(51); 
       
        System.out.println("Display name: " + value.getName()); 
        System.out.println("Display age: " + value.getAge()); 
        System.out.println("Display roll: " + value.getRoll()); 
                
    } 
} 
