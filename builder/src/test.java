import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @author soybean
 * @date 2024/8/23 11:29
 * @description
 */
public class test {
    private static final String[] ELEMENTS = {"TEDU", ".", "CN", "1", "2", "3", "4"};
    private static final String OUTPUT_FILE = "combinations.txt";

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            generateCombinations(new String[7], new boolean[7], 0, writer);
            System.out.println("组合输出完毕:" + OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateCombinations(String[] current, boolean[] used, int index, BufferedWriter writer) throws IOException {
        if (index == 7) {
            writer.write(String.join("", current));
            writer.newLine();
            return;
        }

        for (int i = 0; i < ELEMENTS.length; i++) {
            if (!used[i]) {
                current[index] = ELEMENTS[i];
                used[i] = true;
                generateCombinations(current, used, index + 1, writer);
                used[i] = false;
            }
        }
    }
}
