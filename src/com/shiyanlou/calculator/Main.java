package com.shiyanlou.calculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // 设置程序显示的界面风格，可以去除
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Calculator();
    }
}