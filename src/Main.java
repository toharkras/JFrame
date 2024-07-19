//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static final int DEFAULT_MARGIN=5;

    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(600, 400);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
       JButton myButton= new JButton();
       myButton.setText("Click");
       myWindow.add(myButton);
       myButton.setBounds(10,20,300,100);
       myButton.addActionListener((event)-> {
        //   myButton.setText(String.valueOf(new java.util.Random().nextInt(1000)));
           myButton.setVisible(false);
       });

       JButton button2= new JButton("button2");
       myWindow.add(button2);
       button2.setBounds(myButton.getX(), myButton.getY()+myButton.getHeight()+ DEFAULT_MARGIN,myButton.getWidth(),myButton.getHeight());
       myButton.addActionListener((event)-> {
           button2.setVisible(false);
       });
       button2.addActionListener((event->{
           myButton.setVisible(!myButton.isVisible());
       }));
       myWindow.setVisible(true);



    }

    public static void printTime() {
        new Thread(() -> {
            while (true) {
                System.out.println(new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}