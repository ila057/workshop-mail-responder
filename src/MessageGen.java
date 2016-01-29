import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
38	Paper Presentation	Rohan Rebello	rohanrebello@live.co.uk	9987709910	College of Engineering Pune	Pune	3	Genesis	QPP1004	210.212.183.60
39	Paper Presentation	Abhir Phadte	phadteabhir@gmail.com	8793302476	Goa College of Engineering	panaji	4	Team Six	QPP1005	121.245.68.5
42	Paper Presentation	S.Shobana	29sshobhana93@gmail.com	9092550187	Kongu Engineering College	Erode	4	Instron	QPP1006	210.212.246.46
 * 
 */
public class MessageGen 
{
	public static void main(String arg[])
	{
	try 
	{
		BufferedReader br = new BufferedReader(new FileReader("list.txt"));
		BufferedWriter outfile = new BufferedWriter(new FileWriter("message_list.txt", true));
		outfile.write("---------");
	    //StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	   while (line != null) 
	    {
	       line = br.readLine();
	       //System.out.println(line);
	       String listArray[] = line.split("\t");
	       String message = listArray[3]+"\nDear "+listArray[2]+",\nYour registration for "+listArray[1]+", Quark 2015 has been confirmed.\n\nYour details are as below:\nTeam ID:"+listArray[9]+"\nEmail:"+listArray[3]+"\nYou would receive a confirmatory email once your abstract has been received.\n\n Those who have already submitted their abstracts kindly ignore the following. This is gentle reminder for abstract submission. The last date to submit your abstract is 15th January. Any submission after that will not be entertained.\n\n Thank You.\n\n\n";
	       System.out.println(message);
	       outfile.write(message);
	    }
	   
	   

	    //String everything = list.toString();
	    
	    br.close();
	    outfile.close();
	} 
    
    catch(Exception e) 
     	{
         System.out.println("Exception");
     	}
	}
}
