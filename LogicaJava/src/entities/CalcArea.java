package entities;

public class CalcArea {
    public double width;
    public double length;
    public double price;
    public char opt;
    public double area(){
        return width * length;
    }
    public double value(){
        return area() * price;
    }

    public String toString(){
        return "A área de " + area() + " tem o valor de: R$ " + value();
    }


}
