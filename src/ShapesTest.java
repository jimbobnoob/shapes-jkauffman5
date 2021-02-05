public class ShapesTest {
    public static void main(String[] args) {
        // Create shape objects
        Cuboid cuboidExample = new Cuboid(5, 5, 3);
        Cylinder cylinderExample = new Cylinder(5, 6);
        Sphere sphereExample = new Sphere(5);

        // Render shape objects
        cuboidExample.render();
        cylinderExample.render();
        sphereExample.render();
    }
}
