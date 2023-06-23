
public class Bateria extends Parte {
    
    private int horas;
    private String material;

    public Bateria(int horas, String material, int tiempo) {
        super(tiempo);
        this.horas = horas;
        this.material = material;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
    
    
    
}
