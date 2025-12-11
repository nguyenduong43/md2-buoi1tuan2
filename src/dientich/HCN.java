package dientich;

public class HCN extends hinh {
    private double dai;
    private double rong;
    public HCN(double dai, double rong) {
        this.dai=dai;
        this.rong=rong;
    };
    public HCN(String color,String filled,double dai, double rong) {
        this.dai=dai;
        this.rong=rong;
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getAreaHCN(double dai, double rong)
    {
        return this.dai*this.rong;
    }
    public String toString()
    {
        return super.toString()+" dien tich="+this.getAreaHCN(dai,rong);
    }
    public void hienthiHCN()
    {
        System.out.println(this.toString());
        // System.out.println("hinh chu nhat co color="+this.getColor()+" co dien tich="+this.getAreaHCN(this.dai,this.rong));
    }
}
