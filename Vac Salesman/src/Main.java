import java.io.*;

/*
 * @author Antonio Contreras
 */
public class Main {
	 public static void main(String [] args) {

	        /** The name of the file to open, name would change according to the different
	         *  files.*/
	        String fileName = "temp.txt";

	        // This will reference one line at a time
	        String line = null;

	        try {
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   
	            //This is where I ran out of time so I will commence with Pseudocode
	            
	            /** I would parse each line in a way that i can get both the city
	             *  and the countr*/
	            while (comma is not scene):
	            	String city = everything before comma
	            String country = everything after comma
	            
	             //I would then save that  information into a HashMaop where the key is the
	            // city and the value is the country. 
	            HashMap.put(city, country)
	            
	            //I could later iterate through the hashmap and find the maze distance for every
	            //two entries and i would add those values up to have the total distance travelled.
	            //My only problem would be trying to figure out the actual distance between each city.
	            //I could look them up and hardcode those values into a hashmap, but I am sure there 
	            //is pre-made tools that are made for this purpose.
	            
	            
	            //end of Pseudocode
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }catch(IOException ex) {
	            System.out.println( "Error reading file '" + fileName + "'");                  
	        }
	    }
}
