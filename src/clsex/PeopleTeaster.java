package clsex;

public class PeopleTeaster {
    public static void main(String[] args) {

        int [] arr = new int[3];
        People [] myArr = new People[3];


        myArr[0] = new American();
        myArr[1] = new Korean();
        myArr[2] = new Janpanese();
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
    }
}
