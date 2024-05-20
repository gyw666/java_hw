package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jtb=new JButton("点我啊");
        jtb.setBounds(0,0,100,50);
        //事件被触发之后要执行的代码
//        jtb.addActionListener(new MyActionListener());
        //因为业务逻辑只用一次,用匿名内部类更好
        jtb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我");
            }
        });

        jFrame.add(jtb);


        jFrame.setVisible(true);
    }
}
