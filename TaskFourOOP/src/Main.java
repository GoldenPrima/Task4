
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());
        rectangle.resizeHeight(100);
        rectangle.resizeWidth(100);
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());
    }
}