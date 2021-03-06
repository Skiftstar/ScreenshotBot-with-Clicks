package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOneListener implements ActionListener {

    Controller main;
    String title;
    JTextField field;

    public ButtonOneListener(Controller main, String title, JTextField field) {
        this.main = main;
        this.title = title;
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame(title);
        frame.setOpacity(0.2f);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocation(0, 0);
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
        frame.setResizable(false);
        frame.addMouseListener(new MouseListener(main, frame, field));
    }
}
