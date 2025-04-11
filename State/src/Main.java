import ui.Player;
import ui.UI;

import java.util.Arrays;
import java.util.List;

/**
 * @author soybean
 * @date 2025/3/11 11:26
 * @description
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}