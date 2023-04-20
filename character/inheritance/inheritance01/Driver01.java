package character.inheritance.inheritance01;

public class Driver01 {
    public static void main(String[] args){
        동물 animal = new 동물();
        포유류 mammalia = new 포유류();
        조류 bird = new 조류();
        고래 whale =  new 고래();
        박쥐 bat = new 박쥐();
        참새 sparrow = new 참새();
        펭귄 penguin = new 펭귄();

        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();

        //이렇게 구현하게 되면 절차적에서는 큰 충격을 받게 된다.
        //원래 되로면 각 클래스별로 showMe() 메소드를 구현해야 하지만, extends 를 통해 상속 하므로 모든 기능을 넘겨 줬다.
    }

}
