import java.awt.*;

public class TitlePanel extends Panel {

    TitlePanel() {
        setLayout(null);
        Button startResearch = new Button("企業研究");
        startResearch.setBounds(250, 300, 120, 50);
        startResearch.addActionListener(e -> {
            Frame frame = (Frame) getParent();
            CardLayout cardLayout = (CardLayout) frame.getLayout();
            cardLayout.next(frame);
        });
        add(startResearch);

        Label titleCall = new Label("就活支援ツール");
        titleCall.setBounds(70, -200, 450, 600);
        titleCall.setFont(new Font("serif", Font.PLAIN, 60));
        add(titleCall);
    }
}
