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

        JLabel l1 = new JLabel("Book");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        JButton b1 = new JButton("ADD");
        JButton b2 = new JButton("UPDATE");
        JButton b3 = new JButton("DELETE");
        leftPanel.add(l1);
        leftPanel.add(b1);
        leftPanel.add(b2);
        leftPanel.add(b3);

        JLabel l2 = new JLabel("Member");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        JButton m1 = new JButton("ADD");
        JButton m2 = new JButton("UPDATE");
        JButton m3 = new JButton("DELETE");
        leftPanel.add(l2);
        leftPanel.add(m1);
        leftPanel.add(m2);
        leftPanel.add(m3);

        JLabel l3 = new JLabel("Employee");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        JButton e1 = new JButton("ADD");
        JButton e2 = new JButton("UPDATE");
        JButton e3 = new JButton("DELETE");
        leftPanel.add(l3);
        leftPanel.add(e1);
        leftPanel.add(e2);
        leftPanel.add(e3);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }// End of main
}// End of class