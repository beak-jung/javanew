package cls;

public class Employee extends Person{

    private String company;
    private String position;
    private String department;


    public Employee() {
        super();
        this.company = "";
        this.position = "";
        this.department = "";
    }

    public Employee(String name, int age, String gender, String company, String position, String department){
        super(name, age);
        this.setGender(gender);
        this.company = company;
        this.position = position;
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void introduce() {
        System.out.printf("이름 %s 회사 %s 부서 %s 직급 %s", getName(), company, department, position);
    }
}
