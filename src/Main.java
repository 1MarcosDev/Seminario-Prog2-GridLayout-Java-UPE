import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ScreenHandler screen = new ScreenHandler();
        AppGui app = new AppGui(screen);

        JFrame window = new JFrame("Agenda");
        window.setContentPane(app.getMainGui());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setMinimumSize(new Dimension(532, 354));
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}