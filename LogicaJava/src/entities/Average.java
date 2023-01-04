package entities;

public class Average {
    private final double n1;
    private final double n2;
    private final double n3;
    private final String student;
    public Average(double n1, double n2, double n3, String student){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.student = student;
    }
    public double result(){
        return (n1 + n2 + n3) / 3;
    }
    public String toString(){
        return student + " é: " + String.format("%.2f", result());
    }
}
