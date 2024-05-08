import java.util.Scanner;
public class Main {
    static void UI(boolean ifChosenFigure, String figura, boolean ifDataInsert) {
        if(ifChosenFigure && ifDataInsert) {
            System.out.println("----- MENU -----");
            System.out.println("CHOSEN FIGURE CLASS: " + figura);
            System.out.println("DATA HAS BEEN INSERTED");
            System.out.println("1. Choose figure");
            System.out.println("2. Fill in data");
            System.out.println("3. Show data");
            System.out.println("4. Quit");
            System.out.print("Choice ");
        } else if(ifChosenFigure){
            System.out.println("----- MENU -----");
            System.out.println("CHOSEN FIGURE CLASS: " + figura);
            System.out.println("1. Choose figure");
            System.out.println("2. Fill in data");
            System.out.println("3. Show data");
            System.out.println("4. Quit");
            System.out.print("Choice: ");
        } else {
            System.out.println("----- MENU -----");
            System.out.println("1. Choose figure");
            System.out.println("2. Fill in data");
            System.out.println("3. Show data");
            System.out.println("4. Quit");
            System.out.print("Choice: ");
        }
    }
    public static void main(String[] args) {
        int chosenFigure = 0,ifPrism = 0;
        boolean ifChosenFigure = false, ifDataInsert = false;
        String chosenFigureClass = "brak";
        Triangle tri_1 = new Triangle(false);
        ThreeDim tri_1_threeDim = new ThreeDim();
        Rectangle rect_1 = new Rectangle(false);
        ThreeDim rect_1_threeDim = new ThreeDim();
        Diamond dmnd_1 = new Diamond(false);
        ThreeDim dmnd_1_threeDim = new ThreeDim();

        
        while(true) {
            int chosenOption;
            UI(ifChosenFigure,chosenFigureClass,ifDataInsert);
            Scanner choice = new Scanner(System.in);
            chosenOption = choice.nextInt();
            switch(chosenOption) {
                case 1:
                    System.out.println("Please choose figure: ");
                    System.out.println("1. Triangle");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Diamond");
                    System.out.println("Every other number will trigger going back to menu.");
                    System.out.print("Choice: ");
                    chosenFigure = choice.nextInt();
                    if(chosenFigure == 1) {
                        chosenFigureClass = "Triangle";
                        ifChosenFigure = true;
                        ifDataInsert = false;
                        ifPrism = 0;
                        break;
                    } else if(chosenFigure == 2) {
                        chosenFigureClass = "Rectangle";
                        ifChosenFigure = true;
                        ifDataInsert = false;
                        ifPrism = 0;
                        break;
                    } else if(chosenFigure == 3) {
                        chosenFigureClass = "Diamond";
                        ifChosenFigure = true;
                        ifDataInsert = false;
                        ifPrism = 0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if(!ifChosenFigure) {
                        System.out.println("To fill in data, choose figure first.");
                        break;
                    }

                    if(chosenFigure == 1) {
                        tri_1 = new Triangle(true);
                        System.out.println("Do you want to create prism? Choice [1/0]: ");
                        ifPrism = choice.nextInt();
                        if(ifPrism != 0) {
                            tri_1_threeDim = new ThreeDim(tri_1);
                        }
                        ifDataInsert = true;
                        break;
                    } else if(chosenFigure == 2) {
                        rect_1 = new Rectangle(true);
                        System.out.println("Do you want to create prism? Choice [1/0]: ");
                        ifPrism = choice.nextInt();
                        if(ifPrism != 0) {
                            rect_1_threeDim = new ThreeDim(rect_1);
                        }
                        ifDataInsert = true;
                        break;
                    } else if(chosenFigure == 3) {
                        dmnd_1 = new Diamond(true);
                        System.out.println("Do you want to create prism? Choice [1/0]: ");
                        ifPrism = choice.nextInt();
                        if(ifPrism != 0) {
                            dmnd_1_threeDim = new ThreeDim(dmnd_1);
                        }
                        ifDataInsert = true;
                        break;
                    }
                    break;
                case 3:
                    if(!ifDataInsert && !ifChosenFigure) {
                        System.out.println("To fill in data, you have to choose figure!");
                        break;
                    } else if(ifChosenFigure && !ifDataInsert) {
                        System.out.println("Figure has been chosen but data hasn't been inserted. Fill in data pressing '2'.");
                        break;
                    }

                    if(chosenFigure == 1) {
                        tri_1.print();
                        if(ifPrism != 0) {
                            tri_1_threeDim.print();
                        }
                    } else if(chosenFigure == 2) {
                        rect_1.print();
                        if(ifPrism != 0) {
                            rect_1_threeDim.print();
                        }
                    } else if(chosenFigure == 3) {
                        dmnd_1.print();
                        if(ifPrism != 0) {
                            dmnd_1_threeDim.print();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Closing program, thank you...");
                    System.exit(0);
                default:
                    System.out.println();
                    System.out.println("Please choose correct number (1/2/3/4).");
                    System.out.println();
            }
        }
    }
}