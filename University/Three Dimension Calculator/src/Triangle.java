import java.util.Scanner;
public class Triangle extends Figure implements Printing{
    double a, b, c;

    @Override
    public double calculateArea() {
        return Math.sqrt(((a+b+c)/2)*((((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c)));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("Triangle data: ");
        System.out.println("Sides (a,b,c): "+a+", "+b+", "+c);
        System.out.println("Triangle perimeter: "+calculatePerimeter());
        System.out.println("Triangle area: "+calculateArea());
    }
    Triangle(double a, double b, double c) {
        if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Inserted data is wrong to construct triangle! Please fill in proper data.");
            System.exit(-1);
        }
    }
    public Triangle(boolean ifWrite) {
        if(ifWrite == true) {
            Scanner choice = new Scanner(System.in);
            System.out.print("Please fill in side 1: ");
            double a = choice.nextFloat();
            System.out.print("Please fill in side 2: ");
            double b = choice.nextFloat();
            System.out.print("Please fill in side 3: ");
            double c = choice.nextFloat();

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                this.a = a;
                this.b = b;
                this.c = c;
            } else {
                System.out.println("Inserted data is wrong to construct triangle! Please fill in proper data.");
                System.out.println("Data is going to be set on: 3, 4, 5.");
                this.a = 3;
                this.b = 4;
                this.c = 5;
            }
        } else {

        }
    }
}
