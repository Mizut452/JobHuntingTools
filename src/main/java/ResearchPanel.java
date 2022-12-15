import org.w3c.dom.Text;

import javax.swing.text.LabelView;
import java.awt.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.LinkedBlockingDeque;

public class ResearchPanel extends Panel {

    ResearchPanel() {
        setLayout(null);
        Label ScompanyName = new Label("会社名：");
        Label Sindustry = new Label("業界：");
        Label SheadOffice = new Label("本社所在地：");
        Label SareOsaka = new Label();
        Label SuRL = new Label("URL：");
        Label SadoptURL = new Label("採用ページ：");
        Label Sothers = new Label("その他：");
        TextField companyName = new TextField("companyName");
        TextField industry = new TextField("industry");
        TextField headOffice = new TextField("headOffice");
        Checkbox areOsaka = new Checkbox("大阪事業所の有無：");
        TextField URL = new TextField("URL");
        TextField adoptURL = new TextField("adoptURL");
        TextArea others = new TextArea("others");

        ScompanyName.setBounds(10, 40, 60, 20);
        ScompanyName.setFont(new Font("serif", Font.PLAIN, 15));
        Sindustry.setBounds(20, 80, 60, 20);
        Sindustry.setFont(new Font("serif", Font.PLAIN, 15));
        SheadOffice.setBounds(10, 120, 60, 20);
        SheadOffice.setFont(new Font("serif", Font.PLAIN, 10));
        SuRL.setBounds(20, 160, 60, 20);
        SuRL.setFont(new Font("serif", Font.PLAIN, 15));
        SadoptURL.setBounds(10, 200, 60, 20);
        SadoptURL.setFont(new Font("serif", Font.PLAIN, 10));
        Sothers.setBounds(10, 240, 60, 20);
        Sothers.setFont(new Font("serif", Font.PLAIN, 15));

        companyName.setBounds(90, 40, 300, 20);
        industry.setBounds(90, 80, 300, 20);
        headOffice.setBounds(90, 120, 300, 20);
        URL.setBounds(90, 160, 300, 20);
        adoptURL.setBounds(90, 200, 300, 20);
        others.setBounds(90, 240, 300, 20);

        add(ScompanyName);
        add(Sothers);
        add(Sindustry);
        add(SareOsaka);
        add(SadoptURL);
        add(SheadOffice);
        add(SuRL);

        add(companyName);
        add(industry);
        add(headOffice);
        add(areOsaka);
        add(URL);
        add(adoptURL);
        add(others);
    }


}
