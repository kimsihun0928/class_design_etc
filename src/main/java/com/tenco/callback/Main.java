package com.tenco.callback;

public class Main {

    public static void main(String[] args) {

        // 버튼 생성
        Button button = new Button("버튼");

        // 버튼 클래스 안에는 콜백 메서드가 설계 되어있다.
        // 콜백 메서드의 동작 정의를 외부에서 설계 할 수 있다.
        // 익명 클래스 - 인터페이스를 클래스로 따로 확장하지 않고 바로 클래스로 정의해서
        // 사용할 수 있다.
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(">>> 내 마음대로 콜백 메서드 정의");
                System.out.println(event);
            }
        });

        // 버튼 객체의 click() 메서드가 호출
        button.click("메세지 전달 : click1");
        button.click("또 콜백 메서드 호출 !!");

    } // end of main
}

// 1. 어떠한 클래스에 콜백 메서드를 구현 하고 싶다면
// 2. 먼저 휴대폰을 설계 한다 () <-- 인터페이스 설계 (전화, 메시지 보내는 기능)
// 3. 부모 클래스가 있어야 자식 클래스를 생성한다. (main 클래스에 main() 사용)
// 4. 부모가 자식을 생성할 때 휴대폰도 가질 수 있도록 설계
// 5. 자식의 기능인 click() 메서드가 호출 된다면 자동으로 부모에 메세지를 갈 수 있도록
//    콜백 메서드를 정의 했다. (버튼에서 정의 함)