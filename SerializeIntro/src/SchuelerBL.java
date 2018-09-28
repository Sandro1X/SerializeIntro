
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class SchuelerBL {
    private ArrayList<Schueler> schueler = new ArrayList<>();
    
    public void add (Schueler s){
        schueler.add(s);
    }

    public ArrayList<Schueler> getSchueler() {
        return schueler;
    }
    
    public void save(File f)throws Exception{
//        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
//        
//        for (Schueler s : schueler) {
//            bw.write(s.getName());
//            bw.write(";");
//            bw.write(s.getBirthday().toString());
//            bw.newLine();
//        }
//        bw.flush();
//        bw.close();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        
        for (Schueler s : schueler) {
            oos.writeObject(s);
        }
        
        oos.flush();
        oos.close();
    }
    
    public void load(File f)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        String line;
        
        while((line = br.readLine()) != null){
            String[] attr = line.split(";");
            this.add(new Schueler(attr[0], LocalDate.parse(attr[1], DateTimeFormatter.ISO_DATE)));
        }
        br.close();
    }
}
