package com.tenco.callback.ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubFrame extends JFrame {

    private JButton button;
    private IButtonCallback buttonCallback;

    public SubFrame(IButtonCallback buttonCallback) {

        // 생성자 주입을 통해서 (익명 클래스 전달 받는다)
        this.buttonCallback = buttonCallback;

        setSize(250, 150);
        setLocation(550, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button = new JButton("더하기 버튼");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 내가 직접 숫자를 올리지 않고 연결된 객체의 콜백 메서드를 호출한다.
                // 즉 부모에게 알린다.
                buttonCallback.clickPlusButton();
            }
        });

        add(button);
        setVisible(true);
    }
}
