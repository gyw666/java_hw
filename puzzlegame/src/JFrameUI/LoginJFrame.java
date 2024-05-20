package JFrameUI;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面

    public LoginJFrame() {
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        //让界面显示出来
        this.setVisible(true);
    }
}
