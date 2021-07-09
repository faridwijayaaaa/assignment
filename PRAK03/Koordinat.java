package ALPRO2.PBO;

// Name     : Muhammad Farid Wijayanto
// Nim      : 2013020107
// Class    : 1 A

public class Koordinat {
    // Atribut
    private int x_value;
    private int y_value;

    // Attribute...
    public int getX_value() {
        return x_value;
    }

    public void setX_value(int x_value) {
        this.x_value = x_value;
    }

    public int getY_value() {
        return y_value;
    }

    public void setY_value(int y_value) {
        this.y_value = y_value;
    }

    // Constructor
    public Koordinat(int x_value, int y_value) {
        setX_value(x_value);
        setY_value(y_value);
    }
}
