package clsex;

public class PeopleTeaster {

    public static void  changePigName(Pig pig, String name) { //Pig pig = pig
        pig.setName(name);
    }

    public static void main(String[] args) {

//        Animal an1 = new Animal(); //추상 클래스를 이용하여 민터페이스를


//        People p1 = new People();

        Cat c1 = new Cat("뚱뚱이");
        //Cat c2 = new Cat(c1.getName()); //깊은 복사

        c1.setName("검둥이"); // c1 인스턴스의 이름을 변경해도 c2이름을 변하지 않음

        //Cat c3 = c1; //얕은 복사 객체를 지정하는 함수를 여러개 만든다
        //c3.setName("흰둥이"); // c1의 이름의 변함

        Dog d1 = new Dog("뿡뿡이");
        Pig p1 = new Pig("복덩이");

        changePigName(p1, "얼룩이"); // 새로운 인스턴스를 만들지 않고 p1을 Pig pig에 보낸다.
        System.out.println( p1 );

        changePigName(new Pig("말랑이"), "점백이"); //인스턴스 1개 생성해서 Pig pig에 보낸다 즉 p1과는 상관이 없다.
        System.out.println( p1 );

//        System.out.println( c1 );
//        System.out.println( c2 );
//        System.out.println( d1 );
//        System.out.println( p1 );
//
//        Object [] arrObj = {c1, d1, p1};
        Animal [] arrAni = {c1, d1, p1}; //Pig, Cat, Dog, Animal, Object

        for(Animal obj : arrAni) {
            obj.cry();
        }

        Animal c2 = new Cat("호랑이");
        Animal p2 = new Pig("날씬이");
        Animal d2 = new Dog("발발이");
        Dog d3 = (Dog)d2; //다형성을 이용한 형 변환을 허용
        d3.setBirth(10);
        ((Dog)d2).setBirth(20); //다형성을 이용한 형 변환을 허용

        //주의 : 코드 상에서는 컴파일 에러가 발생하지 않지만 런타임(Exception) 에러가 발생한다
        d3 = (Dog)p2;
        d3.setBirth(10);

//        int [] arr = new int[3];
//        People [] myArr = new People[3];
//
//
//        myArr[0] = new American();
//        myArr[1] = new Korean();
//        myArr[2] = new Janpanese();
//        for(Object obj : myArr) {
//            People p = (People) obj;
//            p.say();
//        }

//        American p1 = new American();
//        Korean p2 = new Korean();
//        Janpanese p3 = new Janpanese();
//
//        p1.say();
//        p2.say();
//        p3.say();
        System.out.println();
        Calculator.add(10, 20);
    }
}
