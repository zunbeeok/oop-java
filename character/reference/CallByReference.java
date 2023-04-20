package character.reference;

public class CallByReference {
    public static void main(String[] args){
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;
        // ref_a변수에는 5번째 줄에서 생성된 Animal 인스턴스의 주소 값이 들어가기 때문.
        // 이것이 CallByReference

        ref_a.age = 10;
        ref_b.age = 20;

        //age
        System.out.println(ref_a.age); // 20
        System.out.println(ref_b.age); // 20

        //5번째에서 생성된 인스턴스 주소
        System.out.println(ref_a); //아래와 출력하는 값이 같다.
        System.out.println(ref_b); 

    }
}


class Animal{
    public int age;
}