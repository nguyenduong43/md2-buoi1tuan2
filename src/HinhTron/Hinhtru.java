package HinhTron;

public class Hinhtru extends Hinhtron{
    private double h;
    public Hinhtru(double h) {
        this.h = h;
    }
    public double getH() {
        return this.h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public Hinhtru(double h, double r,String color) {
        super(r,color);
        this.h = h;
    }
    public String  toString()
    {
        return super.toString()+"<br/>"+"hinh tru: chieu cao:"+this.h+" the tich:"+3.14*this.getR()*this.getR()*this.h;
    }
    public void hienthi()
    {
        System.out.println(this.toString());
    }
}
