import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // string for overblik
        String time = "";
        String amoutOfTrafic = "";
        String area = "";
        String emergency = "";
        //start på intastning for bruger for info til if statements
        System.out.println("Intast tid på dagen (dag/aften/nat): ");
        time = input.next();
        System.out.println("Intast trafikmængde (høj/lav): ");
        amoutOfTrafic = input.next();
        System.out.println("Intast områdets type (bolig/erhverv/blandet: ");
        area = input.next();
        System.out.println("Er det en nødsituation? (ja/nej): ");
        emergency = input.next();
        //if statements om trafiklys
        if (time.equals("dag") && amoutOfTrafic.equals("lav") || emergency.equals("ja")) {
            System.out.println("Det er grønt: kom ind... ");
        } else if ((time.equals("aften") || (time.equals("nat") && amoutOfTrafic.equals("lav")))) {
            System.out.println("Det er gult :(");
        } else {
            System.out.println("Rødt");
        }
        // if statement om adgang
        if (area.equals("erhverv") || area.equals("boligområde") && amoutOfTrafic.equals("lav")) {
            System.out.println("Du har adgang");
        } else if (emergency.equals("ja")){
            System.out.println("Du har adgang");
        } else {
            System.out.println("Adgang forbudt!");
        }
    }
}

