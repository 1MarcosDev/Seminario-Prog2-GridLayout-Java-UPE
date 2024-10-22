import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    private final String number;
    private final ScreenHandler screen;

    public ButtonHandler(String number, ScreenHandler screen) {
        this.number = number;
        this.screen = screen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.printf("[DEBUG] Button %s pressed.\n", this.number);
        this.screen.updatePhone(this.number);
    }
}
