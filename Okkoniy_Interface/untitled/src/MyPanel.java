import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyPanel extends JPanel {
    JLabel l1,l2,l3;
    JTextField f1,f2,f3;
    JButton button;

    MyPanel(){
        l1 = new JLabel("1-е слагаемое ");
        add(l1);

        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);

        l2 = new JLabel("2-e слагаемое: ");
        add(l2);

        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);

        l3 = new JLabel("Сумма: ");
        add(l3);

        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);

        button = new JButton("Вычислить");
        MyListener m = new MyListener();
        button.addActionListener(m);
        add(button);
    }
    public class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int s1 = Integer.parseInt(f1.getText());
            int s2 = Integer.parseInt(f2.getText());
            int s3 = s1 + s2;
            f3.setText(String.valueOf(s3));
        }
    }

}
