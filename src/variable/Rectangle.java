package variable;

public class Rectangle {
    int width;
    int height;

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return (width + height) * 2;
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
