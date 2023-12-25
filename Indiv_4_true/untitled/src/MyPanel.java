import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends Panel {
    JLabel field_add, field_name, field_okrug, field_pop;
    JTextField input_name, input_okrug, input_pop;
    JButton add_student;

    CityGroup cg;

    JLabel field_printer, field_remove;
    JTextArea field_output;
    JTextField remove_input;
    JButton sort_By_name, sort_By_pop, button_del;

    MyPanel() {
        field_add = new JLabel("Добавьте город:");
        add(field_add);

        field_name = new JLabel("Название: ");
        field_okrug = new JLabel("Округ: ");
        field_pop = new JLabel("Население: ");

        input_name = new JTextField();
        input_name.setColumns(10);
        input_okrug = new JTextField();
        input_okrug.setColumns(10);
        input_pop = new JTextField();
        input_pop.setColumns(10);


        add_student = new JButton("Добавить");
        AddingListener adding_listener = new AddingListener();
        add_student.addActionListener(adding_listener);

        add(field_name);
        add(input_name);
        add(field_okrug);
        add(input_okrug);
        add(field_pop);
        add(input_pop);

        add(add_student);

        cg =new CityGroup();

        sort_By_name = new JButton("Сортировка по названию");
        SortByNameListener sbn_listener = new SortByNameListener();
        sort_By_name.addActionListener(sbn_listener);

        add(sort_By_name);

        sort_By_pop = new JButton("Сортировка по населению");
        SortByPopListener sbd_listener = new SortByPopListener();
        sort_By_pop.addActionListener(sbd_listener);

        add(sort_By_pop);

        field_printer = new JLabel("Список городов:");
        add(field_printer);
        field_output = new JTextArea(5, 50);
        add(field_output);

        field_remove = new JLabel("Какой город удалить? ");
        remove_input = new JTextField(10);
        button_del = new JButton("Удалить");
        RemoveListener removeListener = new RemoveListener();
        button_del.addActionListener(removeListener);
        add(field_remove);
        add(remove_input);
        add(button_del);


    }
    void printList() {
        field_output.setText(cg.print());
    }

    class AddingListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = input_name.getText();
            input_name.setText("");
            String okrug = input_okrug.getText();
            input_okrug.setText("");
            int pop = Integer.parseInt(input_pop.getText());
            input_pop.setText("");


            System.out.println("Название: " + name + ", Округ: " + okrug + ", Население: " + pop + " \"");
            cg.add(new City(name, okrug, pop));

            printList();
        }
    }

    class SortByNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cg.SortByName();
            printList();
        }
    }

    class SortByPopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cg.SortByPop();
            printList();
        }
    }

    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cg.del(remove_input.getText());
            printList();
        }
    }
}