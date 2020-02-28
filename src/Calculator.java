import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Vector;

public class Calculator {
    /**
     * 成员变量，操作符，标识符等
     *
     */
    //操作数1，为了程序安全，初值一定设置，这里我们设置为0.
    String str1= "0";
    //操作数2
    String str2 = "0";
    //运算符
    String signal = "+";
    //运算结果
    String result = "";

    //一下为状态开关
    //开关1用于选择输入方向，将要写入str1或str2
    int k1 = 1;
    // 开关2用于记录符号键的次数，如果 k2>1 说明进行的是 2+3-9+8 这样的多符号运算
    int k2 = 1;
    // 开关3用于标识 str1 是否可以被清0，等于1时可以，不等于1时不能被清0；
    int k3 = 1;
    // 开关4用于标识 str2 是否可以被清0
    int k4 = 1;
    // 开关5用于控制小数点可否被录入，等于1时可以，不为1时，输入的小数点被丢掉
    int k5 = 1;
    // store的作用类似于寄存器，用于记录是否连续按下符号键
    JButton store;
    //vt 储存之前输入的运算符
    Vector vt = new Vector<>(20,10);

    /**
     * 声明各个ui组件对象并初始化
     */
    //程序的主窗体
    JFrame frame = new JFrame("Calculator");

    //创建一个JTextField 对象并初始化。 JTextField 是用于显示操作和计算结果的文本框。
    // 参数 20 表明可以显示20列的文本内容
    JTextField result_TextField = new JTextField(result, 20);

    //Clear清除按钮
    JButton clear_Button = new JButton("Clear");
    //数字键和符号键
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button_Dian = new JButton(".");
    JButton button_jia = new JButton("+");
    JButton button_jian = new JButton("-");
    JButton button_cheng = new JButton("*");
    JButton button_chu = new JButton("/");
    JButton button_dy = new JButton("=");

    /**
     * 计算机类的构造器
     */
    public Calculator() {
        // 为按钮设置等效键，既可以通过对应的键盘按键来代替点击它
        button0.setMnemonic(KeyEvent.VK_0);
        button1.setMnemonic(KeyEvent.VK_1);

        //面板1，用于存放数字按钮和符号按钮
        JPanel pan = new JPanel();
        // 网格布局 GridLayout, 设置该容器的布局为四行四列， 边距为5像素
        pan.setLayout(new GridLayout(4,4,5,5));
        pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(button_chu);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(button_cheng);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button_jian);
        pan.add(button0);
        pan.add(button_Dian);
        pan.add(button_dy);
        pan.add(button_jia);
        // 设置 pan 对象的边距
        pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

    }

}
