package variable;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.width = 5;
        rect.height = 8;
        int area = rect.calculateArea(5,8);
        System.out.println("넓이: "+area);

        int perimeter = rect.calculatePerimeter(6,8);
        System.out.println("둘레: " + perimeter);

        boolean square = rect.isSquare(6,8);
        System.out.println("정사각형 여부: " + square);
    }
}
