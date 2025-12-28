import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setLocationRelativeTo(null); //اینجوری بعد از خروج از فول اسکرین به گوشه بالا سمت چپ نمیره
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Fullscreen window
        frame.setUndecorated(false); //Keeps the title bar
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(400, frame.getHeight()));
        leftPanel.setBackground(Color.BLUE);

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(400, frame.getHeight()));
        rightPanel.setBackground(Color.RED);

        JPanel middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension(400, frame.getHeight()));

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(middlePanel, BorderLayout.CENTER);
    }// End of main
}// End of class