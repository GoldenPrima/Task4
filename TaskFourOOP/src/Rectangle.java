public class Rectangle implements Resizable{
    private int height;
    private int width;

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public Rectangle(int height, int weight) {
        this.height = height;
        this.width = weight;
    }

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
