import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class phonebook {

	public static void main(String args[])
	{
		HashMap<String,String> myMap = new HashMap<String,String>();
		char a;
		String filePath = "phonebook.txt"; 
		Scanner sc = new Scanner(System.in);

		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader buf = new BufferedReader(fr);
			String line;
			while((line = buf.readLine()) != null)
			{
			    String [] array = line.split(" ");
                if(array.length >= 2)
                {
                    String key = array[0];
                    String value = array[1];
                    myMap.put(key,value); 
                }
                else
                {
                    System.out.println("Ignoring line " + line);
                }
			}
			System.out.println("The names and phone numbers in \"phonebook.txt\" have been parsed and stored.");			
			buf.close();
		} catch (Exception e) {
			System.out.println("Couldn't find file." + e);
		}

        while(true)
        {

            System.out.println("Type in a name, and their phone-number will be printed: ");
            String keyy = sc.nextLine();
            System.out.println(myMap.get(keyy));
            System.out.println("Would you like to keep going? Type 'y' for yes or 'n' for no ");
            a = sc.next().charAt(0);
            if(a != 'y')
            {
                break;
            }
            
        }
		
	}

}




