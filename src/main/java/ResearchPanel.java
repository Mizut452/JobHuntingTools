import org.w3c.dom.Text;

import javax.swing.text.LabelView;
import java.awt.*;
import java.util.concurrent.LinkedBlockingDeque;

public class ResearchPanel extends Panel {

    ResearchPanel() {
        setLayout(null);
        Label ScompanyName = new Label("会社名：");
        Label Sindustry = new Label("業界：");
        Label SheadOffice = new Label("本社所在地：");
        Label SareOsaka = new Label();
        Label SuRL = new Label("会社のURL：");
        Label SadoptURL = new Label("会社の採用ページ：");
        Label Sothers = new Label("その他：");
        TextField companyName = new TextField();
        TextField industry = new TextField();
        TextField headOffice = new TextField();
        Checkbox areOsaka = new Checkbox("大阪事業所の有無：");
        TextField URL = new TextField();
        TextField adoptURL = new TextField();
        TextArea others = new TextArea();

        ScompanyName.setBounds(10, 10, 50, 10);
        ScompanyName.setFont(new Font("serif", Font.PLAIN, 10));
        Sindustry.setBounds(20, 20, 50, 10);
        Sindustry.setFont(new Font("serif", Font.PLAIN, 10));
        SheadOffice.setBounds(30, 30, 50, 10);
        SheadOffice.setFont(new Font("serif", Font.PLAIN, 10));
        SareOsaka.setBounds(40, 40, 50, 10);
        SareOsaka.setFont(new Font("serif", Font.PLAIN, 10));
        SuRL.setBounds(50, 50, 50, 10);
        SuRL.setFont(new Font("serif", Font.PLAIN, 10));
        SadoptURL.setBounds(60, 60, 50, 10);
        SadoptURL.setFont(new Font("serif", Font.PLAIN, 10));
        Sothers.setBounds(70, 70, 50, 10);
        Sothers.setFont(new Font("serif", Font.PLAIN, 10));

        companyName.setBounds(100, 100, 50, 10);
        industry.setBounds(90, 90, 50, 10);
        headOffice.setBounds(80, 80, 50, 10);
        areOsaka.setBounds(70, 70, 50, 10);
        URL.setBounds(60, 60, 50, 10);
        adoptURL.setBounds(50, 50, 50, 10);
        others.setBounds(40, 40, 50, 10);

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
