
import java.awt.Color;


public class Teclado extends Parte {
    
    private String material;
    private Color color;

    public Teclado(String material, Color color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return material + color;
    }
    
    
    
}
