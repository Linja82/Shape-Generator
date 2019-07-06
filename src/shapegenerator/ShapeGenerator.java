package shapegenerator;

/**
 *
 * @author Alec Lin
 * @date June 18, 2019 3:02 P.M
 */
import java.util.*;
public class ShapeGenerator {
    public static void main(String[] args) {
        final char SHAPESYMBOL = '$'; //Symbol used to print the shapes
        Scanner input = new Scanner(System.in);
        char run = 'Y';
        int horizontalLine = 0;
        int verticalLine = 0;
        int rectangle = 0;
        int rightTriangle = 0;
        int isoscelesTriangle = 0;
        println("Welcome to the Shape Generator: ");
        while (run == 'Y'|| run == 'y'){
            println("\nThis program draws the following shapes: \n1) Horizontal Line \n2) Vertical Line \n3) Rectangle \n4) Left slant right angle triangle \n5) Isosceles triangle");
            int shapeChoice = 0;
            while (shapeChoice < 1 || shapeChoice > 5){
                print("Enter your choice (1-5): ");
                shapeChoice = input.nextInt();
                if (shapeChoice >= 1 && shapeChoice <= 5){
                    switch (shapeChoice) {
                        case 1: { //Prints a horizontal line
                                horizontalLine ++;
                                int length = 0;
                                while(length < 1 || length > 20){
                                    print("\nEnter the length of the horizontal line (1-20): ");
                                    length = input.nextInt();
                                    if (length >= 1 && length <=20){
                                        for (int i = 0; i < length; i++)
                                            print(SHAPESYMBOL);
                                        println("");
                                    }
                                    else
                                        println("Invalid dimension! The dimension must be between 1 and 20.");
                                }
                                break;
                            }
                        case 2: { //Prints a vertical line
                                verticalLine ++;
                                int length = 0;
                                while(length < 1 || length > 20) {
                                    print("\nEnter the length of the vertical line (1-20): ");
                                    length = input.nextInt();
                                    if (length >= 1 && length <=20) {
                                        for (int i = 0; i < length; i++)
                                            println(SHAPESYMBOL);
                                    }
                                    else
                                        println("Invalid dimension! The dimension must be between 1 and 20. ");
                                }
                                break;
                            }
                        case 3:{ //Prints a rectangle
                            rectangle ++;
                            int width = 0;
                            while(width < 1 || width > 20){
                                print("\nEnter the width of the rectangle (1-20): ");
                                width = input.nextInt();
                                if (width >= 1 && width <=20)
                                    break;
                                else
                                    println("Invalid dimension! The dimension must be between 1 and 20. ");
                            }
                            int length = 0;
                            while(length < 1 || length > 20){
                                print("Enter the length of the rectangle (1-20): ");
                                length = input.nextInt();
                                if (length >= 1 && length <= 20)
                                    break;
                                else
                                    println("Invalid dimension! The dimension must be between 1 and 20. ");
                            }
                            for (int i = 0; i < length; i++){
                                for (int j = 0; j < width; j++)
                                    print(SHAPESYMBOL);
                                println("");
                            }
                            break;
                        }
                        case 4:{ //Prints a left slant right angle triangle
                            rightTriangle ++;
                            int height = 0;
                            while (height < 1 || height > 20){
                                print("\nEnter the height of the triangle (1-20): ");
                                height = input.nextInt();
                                if (height >= 1 && height <= 20){
                                    for (int i = 0; i < height; i++){
                                        for (int j = 0; j <= i; j++)
                                            print(SHAPESYMBOL);
                                        println("");
                                    }
                                }
                                else
                                    println("Invalid dimension! The dimension must be between 1 and 20. ");
                            }
                            break;
                        }
                        case 5:{ //Prints an isosceles triangle
                            isoscelesTriangle ++;
                            int height = 0;
                            while (height < 1 || height > 20){
                                print("\nEnter the height of the triangle (1-20): ");
                                height = input.nextInt();
                                if (height >= 1 && height <= 20){
                                    for (int i = 0; i < height; i ++){
                                        for (int j = 0; j < (height - (i+1)); j ++)
                                            print(" ");
                                        for (int k = 0; k < (i *2)+1; k++)
                                            print(SHAPESYMBOL);
                                        println("");
                                    }
                                }
                            }
                            break;
                        }
                        default:
                            break;
                    }
                }
                else
                    println("\nInvalid choice! Your choice must be between 1 and 5.");
            }   
            run = 'z';
            while(run != 'y' || run != 'Y' || run != 'n' || run != 'N'){
                print("Would you like to draw another shape (y/n)? ");
                run = input.next().charAt(0);
                if(run == 'y' || run == 'Y' || run == 'n' || run == 'N')
                    break;
                else
                    println("\nInvalid input! Your input must be a 'y' or 'n'.");
            }
        }
        //Summary time
        println("Here is a summary of the shapes that were drawn.\n");
        println("Horizontal Line                     " + horizontalLine);
        println("Vertical Line                       " + verticalLine);
        println("Rectangle                           " + rectangle);
        println("Left sland right angle triangle     " + rightTriangle);
        println("Isosceles triangle                  " + isoscelesTriangle);
    }
    public static void println(String message){
        System.out.println(message);
    }
    public static void println(char symbol){
        System.out.println(symbol);
    }
    public static void print(String message){
        System.out.print(message);
    }
    public static void print(char symbol){
        System.out.print(symbol);
    }
}
