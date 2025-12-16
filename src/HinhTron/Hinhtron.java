package HinhTron;

public class Hinhtron {
    private double r=1;
    private String color="red";
    public Hinhtron(double r, String color) {
        this.r = r;
        this.color = color;
    }
    public Hinhtron() {}
    public double getR() {
        return this.r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
      return "Hinhtron" + "r=" + this.r + ", color=" + this.color+" dien tich "+3.14*this.r*this.r ;
    }
    public void hienthi()
    {
        System.out.println(this.toString());
    }
}
