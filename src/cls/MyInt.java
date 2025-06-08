package cls;

public class MyInt {
    private int n;

    public MyInt () {
        n = 0;
    }

    public MyInt (int n){
        this.n = n;
    }
   public void setN(int n) {
        this.n=n;
   }
   public int getN() {
        return n;
   }

    @Override
    public String toString() {
        return String.format("%d", n);
    }

    @Override
    public boolean equals(Object obj) {
        //주체와 비교대상(obj)의 클래스가 동일한지 우선 검사
        //필드 n과 비교대상(obj)의 필드n의 서로 동일한지 검사, 같으면 true 다르면 false
        if (!(obj instanceof MyInt))
            return false;
        MyInt target = (MyInt) obj;
        return n == target.n;

    }

    //필드 n을 외부로 부터 입력 받아서 설정하는 setter 메소드를 정의하세요
    //필드n을 외부로 부터 정의하는 getter 메소드를 정의하세ㅐ요
}

// 사요ㅛㅇ자 아이디(문자열) 와 비밀변호 (문자열 형식)을 밀드로 갖는 class MyAccount 클래스를 정으하고
//기본 생성자으,ㅣ 아이디 = "" , 비밀번호는 ""로 정의하고
//추가 생성자 에서는 아이디와 비밀번호 를 매개변수로 입력받아서 필드애 데입하도록 정의하세요
