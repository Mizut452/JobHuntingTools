import javax.swing.*;
import java.awt.*;

public class JHTJFrame extends JFrame {

    JHTJFrame() {
        Panel ComingSoon = new Panel();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton companyResearchButton = new JButton("企業研究");
        companyResearchButton.setBounds(250, 300, 100, 50);
        panel.add(companyResearchButton);
        getContentPane().add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("就活支援ツール");
        setSize(600, 600);
        setVisible(true);

    }

}
