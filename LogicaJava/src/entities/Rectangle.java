package entities;

public class Rectangle {

    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double area(){
        return  base * height;
    }
    public double perimetro(){
        return base * 2 + height * 2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    public String toString(){
        return "AREA: " + area()
               + " PERIMETRO: " + perimetro()
               + " DIAGONAL: " + String.format("%.4f", diagonal());
    }
}
