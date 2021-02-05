import javax.swing.*;

public class Cylinder extends Shape{

    private float radius; // float containing radius
    private float height; // float containing height

    // constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // get/set statements for radius
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // get/set statements for height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Calculate surface area
    @Override
    float surfaceArea() {
        // surface area = 2pi*radius*height + 2pi*r^2
        return (float) (2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.sqrt(this.radius));
    }

    // calculate volume
    @Override
    float volume() {
        // vol = pi*radius^2*height
        return (float) (Math.PI * Math.sqrt(this.radius) * this.height);
    }

    // method to render the information about the cylinder
    @Override
    void render() {
        JOptionPane.showMessageDialog(null,
                "Radius: " + this.radius +
                        "\nHeight: " + this.height +
                        "\nSurface Area = " + this.surfaceArea() +
                        "\nVolume = " + this.volume(),
                "Cylinder", JOptionPane.INFORMATION_MESSAGE);
    }
}
