package cls;

public class MyGame {
    private String Job;
    private String Skill;
    private int Hp;
    private int Mp;

    public MyGame() {
        Job = "";
        Skill = "";
        Hp = 0;
        Mp = 0;
    }

    public MyGame(String Job, String Skill, int Hp, int Mp ) {
        //this 참조변수 자기자신을 가르키는 키워드
        this.Job = Job;
        this.Skill = Skill;
        this.Hp = Hp;
        this.Mp = Mp;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getJob() {
        return Job;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    public String getSkill() {
        return Skill;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getHp() {
        return Hp;
    }

    public void setMp(int Mp) {
        this.Mp = Mp;
    }

    public int getMp() {
        return Mp;
    }

    @Override
    public String toString() {
        return String.format("Job : %s, Skill : %s, Hp %d, Mp %d", Job, Skill, Hp, Mp);
    }

    @Override
    public boolean equals(Object gm) {
        if(!(gm instanceof MyGame))
            return false;

        MyGame is = (MyGame) gm;
        return Job.equals(is.getJob()) &&
                Skill.equals(is.getSkill()) &&
                Hp == is.getHp() &&
                Mp == is.getMp();
    }
}
