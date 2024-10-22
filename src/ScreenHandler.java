public class ScreenHandler {
    private String phone = "";
    private AppGui gui;

    public void setGui(AppGui gui) {
        this.gui = gui;
    }

    public void updatePhone(String number) {
        if (number.equals("DEL") && !this.phone.isEmpty()) {
            int charLen = 1;
            if (this.phone.length() == 4) charLen = 3;
            if (this.phone.length() == 10) charLen = 3;
            this.phone = this.phone.substring(0, this.phone.length() - charLen);
        } else if (!number.equals("DEL") && this.phone.length() < 13) {
            if (this.phone.length() == 2) {
                this.phone += " ";
            }
            if (this.phone.length() == 8) {
                this.phone += "-";
            }
            this.phone += number;
        }
        this.gui.updateScreen(this.phone);
    }
}
