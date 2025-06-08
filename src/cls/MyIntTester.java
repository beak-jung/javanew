package cls;

public class MyIntTester {
    public static void main(String[] args) {
        //데이터 10을 갖는 MyInt형 인스턴스 1개와 정수 20을 MyInt형 인스턴스 1개를 생성하세오
        MyInt n1 = new MyInt(10);
        MyInt n2 = new MyInt();
        n2.setN(10);

        System.out.println(n1);
        System.out.println(n2);

        if(n1.equals(n2))
            System.out.println("n1은 n2와 같다");
        else
            System.out.println("n1은 n2와 다르다");

    }
}
