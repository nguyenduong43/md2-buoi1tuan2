package dientich;

public class hinhtron extends hinh {
    private double r;
    public hinhtron(double r) {
        this.r=r;
    }
    public hinhtron(String color,String filled,double r) {
        this.r = r;
        setColor(color);
        setFilled(filled);
    }
    public double getArea(double r)
    {
        return this.r*this.r*3.14;
    }
    public String toString()
    {
        return super.toString()+" radius:"+this.r+" dien tich= "+this.getArea(this.r);
    }
    public void hienthi()
    {
        System.out.println(this.toString());
    }
}
