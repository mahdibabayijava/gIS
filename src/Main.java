import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

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
        leftPanel.setLayout(new BorderLayout());
        JPanel left1 = new JPanel();
        left1.setPreferredSize(new Dimension(90, frame.getHeight()));
        left1.setBackground(new Color(39, 42, 51));
        JPanel left2 = new JPanel();
        left2.setPreferredSize(new Dimension(250, frame.getHeight()));
        left2.setBackground(new Color(39, 42, 51));

        JPanel middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension(500, frame.getHeight()));
        middlePanel.setBackground(new Color(29, 31, 38));

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(350, frame.getHeight()));
        rightPanel.setBackground(new Color(39, 42, 51));
        JPanel right1 = new JPanel();
        right1.setPreferredSize(new Dimension(90, frame.getHeight()));
        right1.setBackground(new Color(39, 42, 51));
        JPanel right2 = new JPanel();
        right2.setPreferredSize(new Dimension(250, frame.getHeight()));
        right2.setBackground(new Color(39, 42, 51));

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
        boolean[] isActive = new boolean[func.length]; //برای مشخص کردن دکمه toggle
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
            //hovering and unhovering state of the button
            func[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    func[ii].setBackground(new Color(255, 204, 0)); //hovering Color
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    func[ii].setBackground(new Color(246, 233, 179, 255)); //the first split second color of the clicking
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (isActive[ii])
                        func[ii].setBackground(new Color(255, 204, 0)); //stays as the activated color
                    else
                        func[ii].setBackground(new Color(255, 255, 255)); //not hovering Color
                }
            });
            //performing the given action on click
            func[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //only one button can be toggled on at the same time
                    if (isActive[ii]) {
                        isActive[ii] = !isActive[ii]; //toggling on or off
                        func[ii].setBackground(new Color(255, 255, 255)); //not activated color
                    }
                    else  {
                        Arrays.fill(isActive, false);
                        for (int i = 0; i < func.length; i++) {
                            func[i].setBackground(new Color(255, 255, 255)); //not activated color
                        }
                        isActive[ii] = true;
                        func[ii].setBackground(new Color(255, 204, 0)); //activated color
                    }
                }
            });
        }

        JLabel[] label = new JLabel[4];
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel();
            label[i].setForeground(Color.WHITE);
            label[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }

        label[0].setText("Book");
        left1.add(label[0]);
        left2.add(func[0]);
        left2.add(func[4]);
        left2.add(func[8]);

        label[1].setText("Magazine");
        left1.add(label[1]);
        left2.add(func[1]);
        left2.add(func[5]);
        left2.add(func[9]);

        label[2].setText("Member");
        right1.add(label[2]);
        right2.add(func[2]);
        right2.add(func[6]);
        right2.add(func[10]);

        label[3].setText("Employee");
        right1.add(label[3]);
        right2.add(func[3]);
        right2.add(func[7]);
        right2.add(func[11]);

        leftPanel.add(left1, BorderLayout.WEST);
        leftPanel.add(left2, BorderLayout.EAST);

        rightPanel.add(right1, BorderLayout.WEST);
        rightPanel.add(right2, BorderLayout.EAST);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }// End of main
}// End of class