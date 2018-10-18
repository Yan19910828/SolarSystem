import java.io.*;
import java.util.*;
public class SolarSystem {
    public static void testRead()  throws FileNotFoundException, IOException {
        List<List<String>> Solarsystem = new ArrayList<>();
        List<String> Sun = new ArrayList<>();
        List<String> Moon = new ArrayList<>();
        List<String> Earth = new ArrayList<>();
        List<String> Venus = new ArrayList<>();
        Solarsystem.add(Sun);
        Solarsystem.add(Moon);
        Solarsystem.add(Earth);
        Solarsystem.add(Venus);
        BufferedReader br = new BufferedReader(new FileReader("solarsystem.dat"));
        String line;
        Float md;
        
        
        
        while ((line = br.readLine()) != null) {
            if(line.startsWith("Sun")) {
                line = line.replaceAll("\\s{2,}", " ");
                line = line.replaceAll(" "," ");
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
                line = line.replaceAll(" "," ");
                String [] masage = line.split(" ");
                md = (Float.parseFloat(masage[4])+Float.parseFloat(masage[5]))/2;
                Earth.add(masage[0]);
                Earth.add(masage[1]);
                Earth.add(masage[2]);
                Earth.add(masage[3]);
                Earth.add(String.valueOf(md));
                System.out.println(masage[0] + " " +masage[1] + " " +masage[2] + " " +masage[3] + " " +md);}
            if(line.startsWith("Moon")) {
                line = line.replaceAll("\\s{2,}", " ");
                line = line.replaceAll(" "," ");
                String [] masage = line.split(" ");
                md = (Float.parseFloat(masage[4])+Float.parseFloat(masage[5]))/2;
                Moon.add(masage[0]);
                Moon.add(masage[1]);
                Moon.add(masage[2]);
                Moon.add(masage[3]);
                Moon.add(String.valueOf(md));
                System.out.println(masage[0] + " " +masage[1] + " " +masage[2] + " " +masage[3] + " " +md);}
            if(line.startsWith("Venus")) {
                line = line.replaceAll("\\s{2,}", " ");
                line = line.replaceAll(" "," ");
                String [] masage = line.split(" ");
                md = (Float.parseFloat(masage[4])+Float.parseFloat(masage[5]))/2;
                Venus.add(masage[0]);
                Venus.add(masage[1]);
                Venus.add(masage[2]);
                Venus.add(masage[3]);
                Venus.add(String.valueOf(md));
                System.out.println(masage[0] + " " +masage[1] + " " +masage[2] + " " +masage[3] + " " +md);}
            
        }
        
        
    }
    public static void main(String[] args) throws Exception {
        testRead();
    }
    
}
