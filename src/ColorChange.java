import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;

public class ColorChange {

    public static FocusListener myFocusListener = new java.awt.event.FocusListener() {
        private final Color ACTIVE_COLOUR = Color.YELLOW;
        public void focusGained(java.awt.event.FocusEvent focusEvent) {
                JTextField src = (JTextField)focusEvent.getSource();
                src.setOpaque(true);
                src.setBackground(ACTIVE_COLOUR);
        }

        public void focusLost(java.awt.event.FocusEvent focusEvent) {
            JTextField src = (JTextField)focusEvent.getSource();
            src.setOpaque(false);
        }
    };
}