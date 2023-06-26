import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi: ");
        String str = sc.nextLine();
        String[] ss = str.split("");
        List<String> wordList = new ArrayList<>(Arrays.asList(ss));
        Collections.sort(wordList);
        System.out.println("Các từ nhỏ sau khi sắp xếp tăng dần:");
        for (String word : wordList) {
            System.out.print(word + " ");
        }
    }
}
