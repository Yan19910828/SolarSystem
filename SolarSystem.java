package ljj;
import java.io.*;
import java.util.*;
public class SolarSystem {
	 public static void testRead()  throws FileNotFoundException, IOException {
		 	List<List<String>> Solarsystem = new ArrayList<>();
		 	List<String> Sun = new ArrayList<>();
		 	List<String> Earth = new ArrayList<>();
		 	Solarsystem.add(Sun);
		 	Solarsystem.add(Earth);
	        BufferedReader br = new BufferedReader(new FileReader("solarsystem.dat"));
	        String line;
	        Float md;



	        while ((line = br.readLine()) != null) {
	        	if(line.startsWith("Sun")) {
	        		line = line.replaceAll("\\s{2,}", " ");
	        		line = line.replaceAll("	"," ");
	        		String [] masage = line.split(" ");
	        		md = (Float.parseFloat(masage[4])+Float.parseFloat(masage[5]))/2;
	        		Sun.add(masage[0]);
	        		Sun.add(masage[1]);
	        		Sun.add(masage[2]);
	        		Sun.add(masage[3]);
	        		Sun.add(String.valueOf(md));
	        		System.out.println(masage[0] + " " +masage[1] + " " +masage[2] + " " +masage[3] + " " +md);}
	        	if(line.startsWith("Earth")) {
	        		line = line.replaceAll("\\s{2,}", " ");
	        		line = line.replaceAll("	"," ");
	        		String [] masage = line.split(" ");
	        		md = (Float.parseFloat(masage[4])+Float.parseFloat(masage[5]))/2;
	        		Earth.add(masage[0]);
	        		Earth.add(masage[1]);
	        		Earth.add(masage[2]);
	        		Earth.add(masage[3]);
	        		Earth.add(String.valueOf(md));
	        		System.out.println(masage[0] + " " +masage[1] + " " +masage[2] + " " +masage[3] + " " +md);}
	        }
	        
	 }	        
	    public static void main(String[] args) throws Exception {
	        testRead();
	    }

}
