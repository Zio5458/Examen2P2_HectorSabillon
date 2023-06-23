
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class Hilos extends Thread {
    
    
    private int duracion;
    private JProgressBar progress_bar;
    
    private Computadora c;
    private Tecnico t;
    
    private int n = new Random().nextInt(10) + 1;
    private boolean armado;

    public Hilos(int duracion, JProgressBar progress_bar, Computadora c, Tecnico t) {
        this.duracion = duracion;
        this.progress_bar = progress_bar;
        this.c = c;
        this.t = t;
        temp = progress_bar.getMaximum()/duracion;
        chance = t.getEnsambladas();
    }

    private int temp;
    private int chance;
    
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

    public Computadora getC() {
        return c;
    }

    public void setC(Computadora c) {
        this.c = c;
    }

    public Tecnico getT() {
        return t;
    }

    public void setT(Tecnico t) {
        this.t = t;
    }

    public boolean isArmado() {
        return armado;
    }

    public void setArmado(boolean armado) {
        this.armado = armado;
    }
    
    
    
    public void run(){
        while(true){            
            progress_bar.setValue(progress_bar.getValue() + temp);
            try{
                Thread.sleep(duracion);
                if (progress_bar.getValue() == progress_bar.getMaximum()){
                    switch(chance){
                        case 0,1,2,3,4,5:{
                            if(n > 3 && n <= 10){
                                if (progress_bar.getValue() == progress_bar.getMaximum()){
                                    JOptionPane.showMessageDialog(null, "Computadora armada exitosamente");
                                    armado = true;
                                    stop();
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Hubieron complicaciones armando la computadora");
                                armado = false;
                                stop();
                            }
                                
                            break;
                        }
                        case 6,7,8,9,10,11,12,13,14,15:{
                            if(n > 2 && n <= 10){
                                if (progress_bar.getValue() == progress_bar.getMaximum()){
                                    JOptionPane.showMessageDialog(null, "Computadora armada exitosamente");
                                    armado = true;
                                    stop();
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Hubieron complicaciones armando la computadora");
                                armado = false;
                                stop();
                            }
                            break;
                        }
                        case 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30:{
                            if(n > 1 && n <= 10){
                                if (progress_bar.getValue() == progress_bar.getMaximum()){
                                    JOptionPane.showMessageDialog(null, "Computadora armada exitosamente");
                                    armado = true;
                                    stop();
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Hubieron complicaciones armando la computadora");
                                armado = false;
                                stop();
                            }
                            break;
                        }
                        default:{
                            if(n > 1/7 && n <= 10){
                                if (progress_bar.getValue() == progress_bar.getMaximum()){
                                    JOptionPane.showMessageDialog(null, "Computadora armada exitosamente");
                                    armado = true;
                                    stop();
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Hubieron complicaciones armando la computadora");
                                armado = false;
                                stop();
                            }
                            break;
                        }
                    }
                }
                    
            }catch (Exception e){                
            }
        }
    }
    
}
