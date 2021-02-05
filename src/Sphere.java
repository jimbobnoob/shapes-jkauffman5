import javax.swing.*;

public class Sphere extends Shape{

    private float radius; // float to store radius of sphere

    public Sphere(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // calculate surface area
    @Override
    float surfaceArea() {
        // surface area = 4pi*r^2
        return (float) (4 * Math.PI * Math.sqrt(this.radius));
    }

    // calculate volume
    @Override
    float volume() {
        // vol = 4/3 * pi * r^3
        return (float) (4/3 * Math.PI * Math.cbrt(this.radius));
    }

    @Override
    void render() {
        JOptionPane.showMessageDialog(null,
                "Radius: " + this.radius +
                        "\nSurface Area = " + this.surfaceArea() +
                        "\nVolume = " + this.volume(),
                "Sphere", JOptionPane.INFORMATION_MESSAGE);
    }
}
