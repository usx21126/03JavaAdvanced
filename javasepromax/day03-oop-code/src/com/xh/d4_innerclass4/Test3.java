package com.xh.d4_innerclass4;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        //拓展 桌面编程
        //1.创建窗口
        JFrame win = new JFrame("登录一下");

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn =new JButton("登录");
        panel.add(btn);
        //给按钮绑定监听对象，可以用来监听用户的点击，以便做出反应
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击我了，我要登录");
//                JOptionPane.showMessageDialog(win, "没事别点我！");
//            }
//        });
        btn.addActionListener(e-> JOptionPane.showMessageDialog(win, "没事别点我！"));
        //2.设计大小，居中展示
        win.setSize(300, 300);
        win.setVisible(true);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
