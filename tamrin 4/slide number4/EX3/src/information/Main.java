package information;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Info person=new Info();
        person.setName("kimia naseri");
        person.setId("981113061");
        person.setFathername("hadi");
        List<String> list=new ArrayList<>();
        list.add("20");
        list.add("18");
        list.add("15");
        list.add("19");
        list.add("12");
        for(String s : list)
            System.out.println(s);

        System.out.println("persons name:" + person.getName() + " persons id: " + person.getId() + " persons fathers name: " + person.getFathername());
    }
}
