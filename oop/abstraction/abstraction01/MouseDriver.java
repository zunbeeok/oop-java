package oop.abstraction.abstraction01;

public class MouseDriver {
        //해당 지점까지 메모리 스냅샷 구조를 보면
        //스태틱 영역(클래스) 메모리에 java.lang, MouseDriver, Mouse 가 생성되었다.
        // 이때 MouseDriver 클래스 영역 안에는 main만 밑줄 그어진 상태로 존재.
        // Mouse클래스 안에는 초기값이 세팅 되지 않고 name, age, countOfTail, sing() 만 존재
        // 힙과 스택에는 생성이 되지 않는다. 
    public static void main(String[] args){
        //스택 메모리에 main()스택 프레임 생성;
        
        Mouse mickey = new Mouse();
        // 1. new Mouse()를 통해 힙 영역에 Mouse()가 생성 ex) 생성된 힙의 메모리주소 : 0x01
        // 2. Mouse mickey 변수 공간을 main 스택 프레임 안에 생성된다.
        // 3. 대입문을 통해 main()스택 프레임의 Mouse mickey변수에 1.에서 생성된 힙의 메모리주소 0x01을 대입.
        // 위 문장은 아래와 같이 의역 할 수 있다.
        // 한마리 쥐가 태어났으니 그 이름을 mickey라 한다.
        // 쥐 : 클래스
        // 한 마리 쥐 : 클래스의 인스턴스 = 겍체
        // mickey : 객체 참조 변수
        
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail =1;
        // 이후 객체 참조 변수 mickey와 참조 연산자(.)을 이용해 실제 힙 상의 객체에 접근하여 name 속성에 "미키"라는 문자열을 할당.

        mickey.sing();
        // 마찬가지로 참조변수와 참조 연산자를 통해 sing()메소드를 실행.

        mickey = null;
        // 미키의 객체가 주소를 null로 할당.
        // 해당 줄 이후 가비지 컬렉터에 의해 힙 영역에서 미키의 객체가 소멸.

        Mouse jerry = new Mouse();
        // jerry라는 객체를 힙영역에 생성, 스택 main 프레임 jerry 변수 공간을 할당, 생성된 jerry 객체의 힙 메모리 주소를 jerry 변수에 할당.

        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;
        // 위와 마찬가지로 참조 변수와 참조 연산자를 통해 값을 할당.

        jerry.sing();
    }
}
