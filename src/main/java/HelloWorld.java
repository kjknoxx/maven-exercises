import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Give me a string.");
        String input = src.nextLine();
        System.out.println(StringUtils.capitalize(input));
        System.out.println(StringUtils.reverse(input));
        System.out.println("Is your string Numeric? "+StringUtils.isNumeric(input));
        System.out.println(StringUtils.swapCase(input));
    }

}
