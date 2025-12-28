import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setBackground(new Color(29, 31, 38));
        frame.setLocationRelativeTo(null); //اینجوری بعد از خروج از فول اسکرین به گوشه بالا سمت چپ نمیره
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Fullscreen window
        frame.setUndecorated(false); //Keeps the title bar
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(350, frame.getHeight()));
        leftPanel.setBackground(new Color(39, 42, 51));

        JPanel middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension(500, frame.getHeight()));
        middlePanel.setBackground(new Color(29, 31, 38));

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(350, frame.getHeight()));
        rightPanel.setBackground(new Color(39, 42, 51));

        JLabel titleLabel = new JLabel("Book");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        JButton b1 = new JButton("ADD");
        JButton b2 = new JButton("UPDATE");
        JButton b3 = new JButton("DELETE");

        leftPanel.add(titleLabel);
        leftPanel.add(b1);
        leftPanel.add(b2);
        leftPanel.add(b3);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }// End of main
}// End of class