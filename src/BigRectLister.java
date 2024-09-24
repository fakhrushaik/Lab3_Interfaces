import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1, 2, 2)); // Perimeter 8
        rectangles.add(new Rectangle(1, 1, 3, 3)); // Perimeter 12
        rectangles.add(new Rectangle(1, 1, 4, 2)); // Perimeter 12
        rectangles.add(new Rectangle(1, 1, 5, 5)); // Perimeter 20
        rectangles.add(new Rectangle(1, 1, 1, 1)); // Perimeter 4

        BigRectangleFilter filter = new BigRectangleFilter();
        System.out.println("Big Rectangles (Perimeter > 10):");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Rectangle with width " + rect.getWidth() + " and height " + rect.getHeight());
            }
        }
    }
}
