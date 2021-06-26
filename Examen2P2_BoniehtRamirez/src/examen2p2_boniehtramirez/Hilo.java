package examen2p2_boniehtramirez;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo extends Thread{
    private JProgressBar barra;
    private Vehiculo vehiculo;
    private Bateria bateria;

    public Hilo(JProgressBar barra, Vehiculo vehiculo, Bateria bateria) {
        this.barra = barra;
        this.vehiculo = vehiculo;
        this.bateria = bateria;
    }
    
    public void escribirArchivo() throws FileNotFoundException, IOException{
        File file = new File("./Ensamblaje.bin");
        FileOutputStream fs = new FileOutputStream(file,true);
        ObjectOutputStream bs = new ObjectOutputStream(fs);
        
        bs.writeObject(this.vehiculo);
        bs.writeObject(this.bateria);
        
        bs.flush();
        fs.flush();
        
        bs.close();
        fs.close();
    }

    @Override
    public void run() {
        try {
            this.barra.setMaximum(this.bateria.getTiempoEnsamblaje());
            while(this.barra.getValue() != this.barra.getMaximum()){
                this.barra.setValue(this.barra.getValue()+1);
                Thread.sleep(1000);
            }
            JOptionPane.showMessageDialog(null,"¡Ensamblaje listo!");
            this.barra.setValue(0);
            Thread.sleep(1000);
            
            try {
                escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
