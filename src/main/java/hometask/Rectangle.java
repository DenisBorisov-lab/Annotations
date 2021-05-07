package hometask;

@ToString(includeName = true)
public class Rectangle {
    @ToString(includeName = true)
    int width;
    int height;
    int x;
    int y;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(ToStrings.converter(rectangle));
    }
}
