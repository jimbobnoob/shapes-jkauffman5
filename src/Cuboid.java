import javax.swing.*;

public class Cuboid extends Shape {


    private float width; // float containing width of the cuboid
    private float height; // float containing height of the cuboid
    private float depth; // float containing depth of the cuboid

    // constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // get/set statements for width
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // get/set statements for height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // get/set statements for depth
    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // calculate surface area
    @Override
    float surfaceArea() {
        // SA = 2(dw) + 2(hd) + 2(hw)
        return 2*(this.depth * this.width) + 2*(this.height * this.depth) + 2*(this.height * this.width);
    }

    // calculate volume
    @Override
    float volume() {
        // vol = depth + width + height
        return this.depth + this.height + this.width;
    }

    // method to render the information about a cuboid
    @Override
    void render() {
        JOptionPane.showMessageDialog(null,
                "Width: " + this.width +
                        "\nHeight: " + this.height +
                        "\nDepth: " + this.depth +
                        "\nSurface Area = " + this.surfaceArea() +
                        "\nVolume = " + this.volume(),
                "Cuboid", JOptionPane.INFORMATION_MESSAGE);
    }
}
