package cls;

public class MyAccount {
    private String id;
    private String passward;

    public MyAccount() {
        id = "";
        passward = "";
    }
    public MyAccount(String id, String pw) {
        this.id = id;
        passward = pw;
    }
    public void setid (String id) {
        this.id = id;
    }
    public String getid() {
        return id;
    }

    public void setPassward (String pw) {
        passward= pw;
    }
    public String getPassward() {
        return passward;
    }

    @Override
    public String toString() {
        return String.format("ID : %s\nPassward : %s", id, passward);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyAccount))
            return false;

        MyAccount acc = (MyAccount)obj;
        return id.equals(acc.getid()) &&
                passward.equals(acc.getPassward());
    }

    //id passward 필드에 대해서 각각 setterdhk getter를 정의
}



