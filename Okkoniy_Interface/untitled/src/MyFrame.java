import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}
