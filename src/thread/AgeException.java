package thread;

//클래스 앞에 final이 있으면 해당 클래스는 더 이상 파생 시킬수 럾는 최종 자식 클래스
public final class AgeException extends Exception {

    private final String message;

    public AgeException(String msg) {
        message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
