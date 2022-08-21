package Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double X = input.nextDouble();
        double Y = input.nextDouble();
        Circle c1 = new Circle(X,Y);
        System.out.println("x = " + c1.x + "\ny = " + c1.y + "\nLenght without args = " + c1.lenght() + "\nLenght with args = " + c1.lenght(32, 19));
    }
}
class Circle{
    double x, y;
    {
        double pi = Math.PI;
        x = 1; y = 1;
    }
    Circle(){}
    Circle(double x, double y){
        this.x = x; this.y = y;
    }
    double lenght(double x, double y){
        return Math.sqrt(x*x + y*y);
    }
    double lenght(){
        return Math.sqrt(x*x + y*y);
    }
}
