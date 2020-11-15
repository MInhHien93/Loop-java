package com.display20prime;

public class Geometric {
    private String color = "white";
    private String filled = null;

    public Geometric(){

    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {

        return filled;
    }

    public void setFilled(String filled) {

        this.filled = filled;
    }

    public String toString() {
//        return "Geometric{" +
//                "color='" + color + '\'' +
//                ", filled='" + filled + '\'' +
//                '}';
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }

    public static void main(String[] args) {
//        Geometric geometric = new Geometric();
//        geometric.getColor();
//        geometric.setFilled("blue");
//        System.out.println(geometric.toString());
        Circle circle = new Circle(5);
        circle.setFilled("blue");
        circle.setColor("yellow");
        System.out.println("The circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.printf("The area is %.2f\n", circle.getArea());
        System.out.printf("The perimeter is %.2f\n", circle.getPerimeter());
        System.out.println();
        Rectange rectange = new Rectange(2, 5);
        rectange.setColor("red");
        rectange.setFilled("green");
        System.out.println("The rectangle" + rectange.toString());
        System.out.println("The area is " + rectange.getArea());
        System.out.println("The perimeter is " + rectange.getPerimeter());


    }
}
