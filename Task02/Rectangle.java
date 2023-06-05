package Task02;

/**
 * Rectangle
 */
public class Rectangle {

    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        width = 4;
        height = 2;
    }

}