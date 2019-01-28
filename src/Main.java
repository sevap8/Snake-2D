import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        JFrame obg = new JFrame();
        GemePlay gemePlay = new GemePlay();

        obg.setBounds(10,10,905, 700);
        obg.setBackground(Color.DARK_GRAY);
        obg.setResizable(false);
        obg.setVisible(true);
        obg.setDefaultCloseOperation(obg.EXIT_ON_CLOSE);
        obg.add(gemePlay);
    }
}
