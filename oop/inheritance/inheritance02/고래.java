package oop.inheritance.inheritance02;

public class 고래 extends 동물 implements 헤엄칠수있는{
    고래(){
        myClass = "고래";
    }

    @Override
    public void swim(){
        System.out.println(myClass + "수영 중. 어프!!! 어프!!!");
    }
}
