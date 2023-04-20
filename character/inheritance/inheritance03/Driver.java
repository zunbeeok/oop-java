package character.inheritance.inheritance03;

public class Driver {
    public static void main(String[] args){
        // 11번 줄이 끝나고 나서 메모리 구조는
        //  스태틱 : java.lang, Driver, Animal, Penguin 
        //  스택 : main()스택 프레임(pororo[:Penguin 인스터스 주소], args)
        //  힙 :  Penguin(habitat:null, showHabitat()), Animal(name : null, showName())
        // 여기서 알 수 있는 사실은 하위 클래스의 인스턴스가 생성 될 때 상위 클래스의 인스턴스도 함께 생성된다.
        // 실제로는 모든 클래스의 최상위 클래스인 Obejct 인스턴스도 생성된다.
        Penguin pororo = new Penguin();
        // 펭귄 한 마리가 태어나니 펭귄 역할을 하는 prororo라는 이름 지었다.

        pororo.name = "뽀로로";
        // pororo의 name을 "뽀로로"라 하자.
        pororo.habitat = "남극";
        // pororo의 habitat를 "남극"이라 하자.

        pororo.showMe();
        // prororo야 너의 이름을 보여다오.
        pororo.showHabitat();
        // pororo야 너의 서식지를 보여다오.

        // 포로로의 경우에는 showHabitat메소드가 사용이 가능하다.
        // 포로로가 생성될 때에는 클래스 타입을 Penguin으로 주었기 때문에 참조변수를 통해 showHabitat() 메소드에 접근이 가능하다.

        Animal pingu = new Penguin();

        pingu.name ="핑구";
        // pingu.habitat = "ebs";
        // 핑구는 showHabitat메소드가 사용이 불가능하다.
        // 핑구 같은경우에는 생성 시에 참조 변수에 타입을 Animal로 잡아주었다.
        // 이때 핑구 참조변수는 힙에서 Animal을 가르킨다. 정확히는 :Penguin :Animal 이 같이 힙에 생성되어도 Animal을 바라본다.
        // 형변환, 암묵적 형변환
        // 책에서는 형변환, 암묵적 형변환 이라고 하는데 이해가 잘 되지 않는다.
        

        pingu.showMe(); 
        // pingu.showHabitat();

        // Penguin happyfeet = new Animal();
        //실행 되지 않는 이유는 Animal클래스가  Penguin클래스보다 상위 클래스 이기 때문.
        // "하위 클래스는 상위 클래스 이다." 이지만 반대가 될 수는 없다.



        //형변환 테스트 코드

        // int a = 1;
        // double b = 0.001;

        // int c;
        // double d;
        // c = a+b;
        // d = a+b; 

        //이게 형변환인데...
    }
}
