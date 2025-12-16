package Diem;
import java.util.Scanner;
public class testPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap xSpeed=");
        float xSpeed = sc.nextFloat();
        System.out.println("nhap ySpeed=");
        float ySpeed=sc.nextFloat();
        MovablePoint point=new MovablePoint(xSpeed,ySpeed,5,6);
        System.out.println(point.toString());
        point.move();
        System.out.println(point.toString());
    }
}
