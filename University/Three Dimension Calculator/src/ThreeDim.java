import java.util.Scanner;

public class ThreeDim implements Printing {
    Figure base;
    double height;

    double calculateVolume(){
        return (base.calculateArea())*height;
    }
    double calculateEntireArea(){
        return 2*base.calculateArea()+base.calculatePerimeter()*height;
    }

    @Override
    public void print() {
        System.out.println("Prism data created from base (class): "+base.getClass().getSimpleName());
        System.out.println("Volume: "+calculateVolume());
        System.out.println("Entire surface area: "+calculateEntireArea());
    }

    /*ThreeDim(Figure base, double height){
        this.base = base;
        this.height = height;
    }*/
    ThreeDim(Figure base){
        Scanner wybor = new Scanner(System.in);
        System.out.println("Please fill in prism height: ");
        double height = wybor.nextFloat();
        if(height > 0) {
            this.base = base;
            this.height = height;
        }else {
            System.out.println("Inserted data is wrong to construct prism! Please fill in proper data.");
            System.out.println("Height is going to be set on 5.");
            this.base = base;
            this.height = 5;
        }
    }
    ThreeDim() {

    }
}
