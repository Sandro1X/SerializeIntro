
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        oos.writeObject(schueler);
        
        oos.flush();
        oos.close();
    }
    
    public void load(File f)throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        
        schueler = (ArrayList<Schueler>) ois.readObject();
    }
}
