package oop.polymorphism.polymorphism01;

public class Driver {
    public static void main(String[] args){
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        pingu.showName();
        //앞서 상속에서 배운 개념대로면 핑구는 Animal을 바라보기 때문에 오버라이딩이 되지 않는 showName을 출력해야하지 않나?

        //메모리 구조
        
        //상위 클래스 타입의 객체 참조 변수를 사용하더라도 하위 클래스에서 오버라이딩 한 메서드가 호출된다는 사실.
    }
}
