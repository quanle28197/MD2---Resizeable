public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3, "red");
        circles[1] = new Circle(4, "blue");
        circles[2] = new Circle(5, "orange");
        System.out.println("Before resize: ");

        for (Circle circle : circles) {
            System.out.println("The old Area is: " +circle.getArea());
        }

        System.out.println("After resize: ");
        for (Circle circle : circles) {
            circle.resize();

        }
    }
}
