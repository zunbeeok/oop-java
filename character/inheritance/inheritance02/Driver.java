package character.inheritance.inheritance02;

public class Driver {
    public static void main(String[] args){
        날수있는 날라리1 = new 박쥐();
        날라리1.fly();

        //동물 클래스에는 interface가 적용되어 있지 않아 지정이 불가
        //하지만 참새 클래스에는 @Override 를 사용하여 interface를 구현했기 때문에 가능.
        참새 날라리2 = new 참새();
        날라리2.fly();

        헤엄칠수있는[] 맥주병들 =  new 헤엄칠수있는[2];
        맥주병들[0] = new 고래();
        맥주병들[1] = new 펭귄();

        for(헤엄칠수있는 맥주병: 맥주병들){
            맥주병.swim();
        }
    }

    

    
}
