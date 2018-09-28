
import java.io.File;


public class LoadTester {
    
    public void test() throws Exception{
        SchuelerBL bl = new SchuelerBL();
        
        bl.load(new File("src//klasse.bin"));
        
        for (Schueler s : bl.getSchueler()) {
            System.out.println(s);
        }
    }
}
