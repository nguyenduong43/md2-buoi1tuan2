package dientich;

public class hinh {
    private String color="red";
    private String filled="hinh tron";
    public hinh(String color, String filled) {
        this.color = color;
    }
    public hinh() {}
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFilled() {
        return this.filled;
    }
    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString() {
        return "hinh{" + "color=" + this.color + ", filled=" + this.filled + '}';
    }

}
