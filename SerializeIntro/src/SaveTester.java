
import java.io.File;
import java.time.LocalDate;


public class SaveTester {
    
    public static void main(String[] args) throws Exception {
        Schueler s1 = new Schueler("Hans", LocalDate.of(2000, 3, 1));
        Schueler s2 = new Schueler("Grete", LocalDate.of(1999, 10, 10));
        
        SchuelerBL bl = new SchuelerBL();
        bl.add(s1);
        bl.add(s2);
        
        try{
            bl.save(new File("src//klasse.csv"));
        }catch (Exception e){
            e.printStackTrace();
        }
        LoadTester lt = new LoadTester();
        
        try{
            lt.test();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
