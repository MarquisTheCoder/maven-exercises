import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsTesting {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        String reversedString = StringUtils.reverse(input);
        String flippedString  =StringUtils.swapCase(input);
        System.out.format("You entered: %s\n", input);
        System.out.format("Flipped case: %s\n", flippedString);
        System.out.format("Reversed: %s\n", reversedString);


    }
}
