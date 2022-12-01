import java.awt.*;

public class TitlePanel extends Panel {

    TitlePanel() {
        setLayout(null);
        Button startResearch = new Button("企業研究");
        startResearch.setBounds(250, 100, 200, 200);
        startResearch.addActionListener(e -> {
            Frame frame = (Frame) getParent();
            CardLayout cardLayout = (CardLayout) frame.getLayout();
            cardLayout.next(frame);
        });
        add(startResearch);

        Label titleCall = new Label("就活支援ツール");
        titleCall.setBounds(200, 200, 200, 200);
        titleCall.setFont(new Font("serif", Font.PLAIN, 30));
        add(titleCall);
    }
}
