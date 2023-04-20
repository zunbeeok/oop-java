package character.abstraction.abstraction02;

public class MouseDriver {
    //클래스 멤버 메서드
    public static void main(String[] args){
        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);
        
        System.out.println(Mouse.countOfTail);
        
        //static에 접근하는 방법은 여러가지가 있다.
        // 1. 참조변수 (mickey, jerry, mightyMouse)를 사용하여 접근이 가능
        // 2. Class명 Mouse를 통해 접근이 가능하다.
    }
}
