
import javax.swing.JProgressBar;


public class Hilos extends Thread {
    
    private int duracion;
    private JProgressBar progress_bar;
    private int temp = progress_bar.getMaximum()/duracion;
    private Computadora c;
    private Tecnico t;

    public Hilos(int duracion, JProgressBar progress_bar, Computadora c, Tecnico t) {
        this.duracion = duracion;
        this.progress_bar = progress_bar;
        this.c = c;
        this.t = t;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public JProgressBar getProgress_bar() {
        return progress_bar;
    }

    public void setProgress_bar(JProgressBar progress_bar) {
        this.progress_bar = progress_bar;
    }
    
    public void run(){
        while(true){
            progress_bar.setValue(progress_bar.getValue() + temp);
            try{
                Thread.sleep(duracion);
                if (progress_bar.getValue() == progress_bar.getMaximum()){
                    break;
                }
                    
            }catch (Exception e){                
            }
        }
    }
    
}
