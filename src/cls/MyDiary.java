package cls;

public class MyDiary {
    private String title;
    private String day;
    private String story;

    public MyDiary() {
        title = "";
        day = "";
        story = "";
    }

    public MyDiary(String title, String day, String story ) {
        //this 참조변수 자기자신을 가르키는 키워드
        this.title = title;
        this.day = day;
        this.story = story;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getStory() {
        return story;
    }


    @Override
    public String toString() {
        return String.format("Title %s, Day %s, Story %s", title, day, story);
    }

    @Override
    public boolean equals(Object di) {
        if(!(di instanceof MyDiary))
            return false;

        MyDiary is = (MyDiary) di;
        return title.equals(is.getTitle()) &&
                day.equals(is.getDay()) &&
                story.equals(is.getStory());
    }
}
