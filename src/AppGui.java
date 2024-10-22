import javax.swing.*;

public class AppGui {
    private JTextField screen;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JPanel mainGui;
    private JButton agendarButton;
    private JButton excluirButton;
    private JButton delButton;

    public AppGui(ScreenHandler screen) {
        screen.setGui(this);
        a1Button.addActionListener(new ButtonHandler("1", screen));
        a2Button.addActionListener(new ButtonHandler("2", screen));
        a3Button.addActionListener(new ButtonHandler("3", screen));
        a4Button.addActionListener(new ButtonHandler("4", screen));
        a5Button.addActionListener(new ButtonHandler("5", screen));
        a6Button.addActionListener(new ButtonHandler("6", screen));
        a7Button.addActionListener(new ButtonHandler("7", screen));
        a8Button.addActionListener(new ButtonHandler("8", screen));
        a9Button.addActionListener(new ButtonHandler("9", screen));
        a0Button.addActionListener(new ButtonHandler("0", screen));
        delButton.addActionListener(new ButtonHandler("DEL", screen));
    }

    public JPanel getMainGui() {
        return mainGui;
    }

    public void updateScreen(String phone) {
        this.screen.setText(phone);
    }
}
