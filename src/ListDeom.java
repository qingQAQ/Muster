import java.util.ArrayList;
import java.util.List;

public class ListDeom {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add("Java实训");
        list.add(66.66f);
        list.add("List接口");
        list.add(12);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
