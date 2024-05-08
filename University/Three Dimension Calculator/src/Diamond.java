import java.util.Scanner;

public class Diamond extends Figure implements Printing{
    double a, h;
    @Override
    public double calculateArea() {
        return a*h;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Diamond data: ");
        System.out.println("Side and height (a, h): "+a+", "+h);
        System.out.println("Diamond perimeter: "+calculatePerimeter());
        System.out.println("Diamond area: "+calculateArea());
    }
    Diamond(double a, double h){
        if(a>0 && h>0) {
            this.a = a;
            this.h = h;
        } else{
            System.out.println("Inserted data is wrong to construct diamond! Please fill in proper data.");
            System.exit(-3);
        }
    }
    public Diamond(boolean ifWrite) {
        if(ifWrite == true) {
            Scanner choice = new Scanner(System.in);
            System.out.print("Please fill in side : ");
            double a = choice.nextFloat();
            System.out.print("Please fill in height: ");
            double h = choice.nextFloat();
            if (a > 0 && h > 0) {
                this.a = a;
                this.h = h;
            } else {
                System.out.println("Inserted data is wrong to construct diamond! Please fill in proper data.");
                System.out.println("Data will be set on: 4,5");
                this.a = 4;
                this.h = 5;
            }
        } else {

        }
    }
}
