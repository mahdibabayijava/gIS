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

        JButton[] func = new JButton[12];
        for (int i = 0; i < 4; i++) {
            func[i] = new JButton("ADD");
        }
        for (int i = 4; i < 8; i++) {
            func[i] = new JButton("UPDATE");
        }
        for (int i = 8; i < 12; i++) {
            func[i] = new JButton("REMOVE");
        }
        for (int i = 0; i < func.length; i++) {
            func[i].setBackground(Color.WHITE);
            func[i].setForeground(Color.BLACK);
            func[i].setBorderPainted(false);
            func[i].setFocusable(false);
            func[i].setFocusPainted(false);
            func[i].setContentAreaFilled(false);
            final int ii = i; //گفت لازمه کلاس درونی متغیر فاینال بهش بدیم برای اونه
            //rounding the corners of buttons
            func[i].setUI(new javax.swing.plaf.basic.BasicButtonUI() {
                @Override
                public void paint(Graphics g, JComponent c) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(func[ii].getBackground());
                    g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
                    super.paint(g2, c);
                    g2.dispose();
                }
            });
        }


        JLabel l1 = new JLabel("Book");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        leftPanel.add(l1);
        leftPanel.add(func[0]);
        leftPanel.add(func[4]);
        leftPanel.add(func[8]);

        JLabel l2 = new JLabel("Magazine");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        leftPanel.add(l2);
        Component add = leftPanel.add(func[1]);
        leftPanel.add(func[5]);
        leftPanel.add(func[9]);

        JLabel l3 = new JLabel("Member");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        rightPanel.add(l3);
        rightPanel.add(func[2]);
        rightPanel.add(func[6]);
        rightPanel.add(func[10]);

        JLabel l4 = new JLabel("Employee");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        rightPanel.add(l4);
        rightPanel.add(func[3]);
        rightPanel.add(func[7]);
        rightPanel.add(func[11]);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }// End of main
}// End of class