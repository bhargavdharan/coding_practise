import java.util.jar.Manifest;

// package Tap-Academy.Java.Pattern Programming;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int count = i + 1;
            for (int j = 1; j <= 5; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
