import java.util.Scanner;
public class Rectangle extends Figure implements Printing{
    double a, b;

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    public void print() {
        System.out.println("Rectangle data: ");
        System.out.println("Sides: (a, b): "+a+", "+b);
        System.out.println("Rectangle perimeter: "+calculatePerimeter());
        System.out.println("Rectangle area: "+calculateArea());
    }

    Rectangle(double a, double b) {
        if(a>0&&b>0) {
            this.a = a;
            this.b = b;
        } else{
            System.out.println("Inserted data is wrong to construct rectangle! Please fill in proper data.");
            System.exit(-2);
        }
    }
    public Rectangle(boolean ifWrite) {
        if(ifWrite == true) {
            Scanner choice = new Scanner(System.in);
            System.out.print("Please fill in side 1: ");
            double a = choice.nextFloat();
            System.out.print("Please fill in side 2: ");
            double b = choice.nextFloat();
            if (a > 0 && b > 0) {
                this.a = a;
                this.b = b;
            } else {
                System.out.println("Inserted data is wrong to construct rectangle! Please fill in proper data.");
                System.out.println("Data is going to be set on: 4, 5");
                this.a = 4;
                this.b = 5;
            }
        } else {

        }
    }
}
