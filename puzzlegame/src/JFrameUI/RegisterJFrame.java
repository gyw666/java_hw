package JFrameUI;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面
    public RegisterJFrame() {
        this.setSize(488,500);
        //设置界面标题
        this.setTitle("拼图 登录");
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
