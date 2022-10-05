import java.util.Scanner;
import Calculator.Input;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                System.out.println("Please Input a Calculation operation. (Plus, Minus, Dividing and Multiplicationg is supported). Put everything in one line!");
                System.out.println("Put everything in one line! Remind that you have to make a space every Part (e.g 1 + 1, not 1+1)");
                Scanner sc = new Scanner(System.in);
        
                char[] Input = sc.nextLine().toCharArray();
                sc.close();
        
                Input processor = new Input();
                processor.Process(Input);
                System.out.println("Calculation conpleted");
                System.out.println("------------------------");
    
            } catch (Exception e) {
                System.out.println("An internal error ocurred while running. Aborting...");
                System.exit(0);
            }      
        }
    }
}
