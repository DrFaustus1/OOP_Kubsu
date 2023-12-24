import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matrix extends JFrame{
    private JTextField[][] MatrixF;
    private JTextArea Result;
    private JButton But;
    Matrix(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MatrixF = new JTextField[3][3];
        JPanel MatrixP = new JPanel(new GridLayout(3, 3));
        JPanel inputP = new JPanel();

        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++){
                MatrixF[i][j]= new JTextField(5);
                MatrixP.add(MatrixF[i][j]);
            }
        But = new JButton("Calculate");
        But.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clickBut();
            }

        });

        Result = new JTextArea(5, 20);
        Result.setEditable(false);

        inputP.add(MatrixP);
        inputP.add(But);

        add(inputP, BorderLayout.NORTH);
        add(Result);
    }
    private void clickBut(){
        try{
            int sum1 =0, sum2 =0;
            int[][] m = new int[3][3];
            for (int i=0;i<3;i++)
                for(int j=0;j<3;j++){
                    m[i][j] = Integer.parseInt(MatrixF[i][j].getText());
                    if (i<j)
                        sum2 +=m[i][j];
                    else if (i>j)
                        sum1 +=m[i][j];
                }
            Result.setText("Матрица: \n" + toString(m) + "\n Сумма элементов над главной диагональю: " + sum2 + "\n Сумма элементов под главной диагональю: " + sum1);
        }
        catch(NumberFormatException e){
            Result.setText("Введите цифры пожалуйста :)");
        }
    }

    private String toString(int[][] m) {
        StringBuilder ms = new StringBuilder();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                ms.append(m[i][j]).append(" ");
            ms.append("\n");
        }
        return ms.toString();
    }
}