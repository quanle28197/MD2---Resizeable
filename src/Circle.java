public class Circle implements Resizeable {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize() {
        double percent = Math.floor(Math.random() * 100) + 1;
        double newArea = getArea() * (1 + percent / 100);
        System.out.println("the new area is: " + newArea + "plus" + percent + "%");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", color =" + color + '\'' +
                '}';
    }
}
