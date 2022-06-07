
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pointsList = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        int pointsInput;
        while (true) {
            pointsInput = scanner.nextInt();
            if (pointsInput == -1) {
                break;
            }
            if (pointsInput > 0 && pointsInput < 100) {
                pointsList.add(pointsInput);
            }
        }

        System.out.println("Point average (all): " + average(pointsList));

        averagePassingPoints(pointsList);

        totalPassing(pointsList);
        
        gradeDistribution(pointsList);

    }

    public static double average(ArrayList points) {

        if (points.isEmpty()) {
            return -1.0;
        }

        int index = 0;
        double sum = 0;

        while (index < points.size()) {
            sum += (int) points.get(index);
            index++;
        }

        return 1.0 * sum / points.size();
    }

    public static void averagePassingPoints(ArrayList points) {

        if (points.isEmpty()) {
            System.out.println("List is Empty");
        }

        int index = 0;
        double sum = 0;
        double totalPassing = 0;

        while (index < points.size()) {
            if ((int) points.get(index) >= 50) {
                sum += (int) points.get(index);
                totalPassing++;
            }
            index++;
        }

        if (sum >= 50) {
            System.out.println("Point average (passing): " + 1.0 * sum / totalPassing);
        } else {
            System.out.println("Point average (passing): -");;
        }

    }

    public static void totalPassing(ArrayList points) {

        if (points.isEmpty()) {
            System.out.println("List is Empty");;
        }

        int index = 0;
        double sum = 0;
        double totalPassing = 0;

        while (index < points.size()) {
            if ((int) points.get(index) >= 50) {
                sum += (int) points.get(index);
                totalPassing++;
            }
            index++;
        }

        if (sum >= 50) {
            System.out.println("Pass percentage: " + 100 * totalPassing / points.size());
        } else {
            System.out.println("Pass percentage: 0.0");;
        }
    }

    public static void printStars(int number) {
        
        if (number == 0){
            System.out.println(" ");
        }
        
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void gradeDistribution(ArrayList points) {
        int countZeroGrade = 0;
        int countOneGrade = 0;
        int countTwoGrade = 0;
        int countThreeGrade = 0;
        int countFourGrade = 0;
        int countFiveGrade = 0;

        for (int i = 0; i < points.size(); i++) {

            if ((int) points.get(i) < 50) {
                countZeroGrade++;                
            } 
            else if((int) points.get(i) < 60) {
                countOneGrade++;            
            }
            else if ((int) points.get(i) < 70) {
                countTwoGrade++;
            }
            else if ((int) points.get(i) < 80) {
                countThreeGrade++;
            }
            else if ((int) points.get(i) < 90) {
                countFourGrade++;
            }
            else {
                countFiveGrade++;
            }            
        }
        
        System.out.println("Grade distribution:");
   
        System.out.print("5: ");
        printStars(countFiveGrade);
        System.out.println("");
        
        System.out.print("4: ");
        printStars(countFourGrade);
        System.out.println("");
        
        System.out.print("3: ");
        printStars(countThreeGrade);
        System.out.println("");
        
        System.out.print("2: ");
        printStars(countTwoGrade);
        System.out.println("");
        
        System.out.print("1: ");
        printStars(countOneGrade);
        System.out.println("");
        
        System.out.print("0: ");
        printStars(countZeroGrade);
        
    }
}
