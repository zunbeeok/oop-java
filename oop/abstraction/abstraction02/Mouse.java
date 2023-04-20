package oop.abstraction.abstraction02;

public class Mouse {
    public String name;
    public int age;
    //꼬리의 갯수는 모든 쥐가 똑같으므로 static 예약어를 사용하여 모든 인스턴스가 같은 메모리 주소를 바라볼 수 있게 해준다.
    public static int countOfTail = 1;
    //static예약어가 붙은 속성에 접근하기 위해서는 객체_참조_변수.countOfTail로 접근 가능하다. 즉 Mouse.countOfTail로 접근이 가능하다.

    //객체 멤버 메서드
    public void sing(){
        System.out.println(name +  "찍찍!!!");
    }

}
