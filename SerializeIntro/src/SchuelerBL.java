
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class SchuelerBL {
    private ArrayList<Schueler> schueler = new ArrayList<>();
    
    public void add (Schueler s){
        schueler.add(s);
    }
    
    public void save(File f)throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        
        for (Schueler s : schueler) {
            bw.write(s.getName());
            bw.write(";");
            bw.write(s.getBirthday().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    public void load()throws Exception{
        
    }
}
