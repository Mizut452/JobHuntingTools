import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JobHuntingTools extends Frame {
    public static void main(String[] args) {
        JobHuntingTools jobHuntingTools = new JobHuntingTools();
        jobHuntingTools.setVisible(true);
    }

    JobHuntingTools() {
        setTitle("就活支援ツール");
        setSize(600, 600);
        setLocationRelativeTo(null);

        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);
        add(new TitlePanel(), "TitlePanel");
        add(new ResearchPanel(), "ResearchPanel");

        addWindowListener(new WinListener());
    }

    class WinListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
