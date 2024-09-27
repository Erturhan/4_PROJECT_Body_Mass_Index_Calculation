import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double height, weight;
        double index = 0;
        System.out.print("Please , enter your height (in meters) : ");
        height = scan.nextDouble();

        System.out.print("Please , enter your weight : ");
        weight = scan.nextDouble();

        index = weight / Math.pow(height, 2);

        if (index < 18.5) {
            System.out.println("You are underweight. your index :" + index);
        } else if (index >= 18.5 && index <= 24.9) {
            System.out.println("Your weight is ideal. your index :" + index);
        } else if (index >= 25 && index <= 29.9) {
            System.out.println("You are fat. your index :" + index);
        } else if (index >= 30 && index <= 34.9) {
            System.out.println("You are obese . your index : " + index);
        } else if (index >= 35) {
            System.out.println("You are extremly obese . your index :" + index);
        }


    }
}