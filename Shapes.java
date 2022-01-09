import java.util.Scanner;
public class RunQuad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Square s = new Square();

        System.out.println("Press R for Rectangle or S for Square");
        String choice = scan.nextLine();
        if(choice.equalsIgnoreCase("R")){
            r.showDescription();
        }else if(choice.equalsIgnoreCase("S")){
            s.showDescription();
        }


    }
}

class Quadrilateral {
    void showDescription() {
        System.out.println("is quadrilateral");
    }

}

class Rectangle extends Quadrilateral {
    public void showDescription() {
        System.out.println("A Rectangle:");
        System.out.println("- has 4 right angles");
        super.showDescription();
    }


}

class Square extends Quadrilateral {
    public void showDescription() {
        System.out.println("A Square:");
        System.out.println("-Has 4 equal sides");
        System.out.println("-Has 4 right angles");
        super.showDescription();
    }

}

