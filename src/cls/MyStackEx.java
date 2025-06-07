package cls;

public class MyStackEx  extends MyStack {
    public MyStackEx() {
        super(); //MyStackd의 default 생성자 호출
    }

    public MyStackEx(int count) {
        super(count); // MyStack(int count) <==== 이러한 생성자로 호출
    }

    //기능 추가
    public boolean isAddPossible() {
        return getCount() > getPosition();
    }
}
