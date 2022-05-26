package Study;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BorderTest extends JFrame {
    JButton btn = new JButton("北部按钮" );
    JLabel label = new JLabel("南部标签");
    JRadioButton sex = new JRadioButton("男");
    JTextArea jTextArea = new JTextArea("输入内容",10,20);
    JButton center = new JButton("中部的按钮");
    Container container;
    BorderTest() {
        super("这是JFrame的标题");

        setSize(600,500);


        container = getContentPane();
        container.add(btn);
        container.setLayout(new BorderLayout());
        container.add(btn,BorderLayout.NORTH);
        label.setPreferredSize(new Dimension(0,80));
        container.add(label,BorderLayout.SOUTH);
        container.add(sex,BorderLayout.WEST);
        container.add(jTextArea,BorderLayout.EAST);
        sex.setPreferredSize(new Dimension(200,0));
        container.add(center,BorderLayout.CENTER);

        URL resource = JFrameTest.class.getResource("校标.png");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderTest();
    }
}
