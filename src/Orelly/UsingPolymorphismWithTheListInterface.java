package Orelly;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class UsingPolymorphismWithTheListInterface {
    public static void main(String[] args){

    List jediNames = new ArrayList();
    jediNames.add("Luke");
    jediNames.add(321);
    jediNames.add(new StringBuilder("Obi Wan"));

    Jedi jedi = new Jedi(jediNames);
    jedi.printJediName();
 //There are many implementations from List That we should use in different situations.
    ListInvoker invoker = new ListInvoker();
    invoker.showElements(new ArrayList<>(List.of("ArrayList")));

    invoker.showElements(new LinkedList<>(List.of("LinkedList")));

    invoker.showElements(new Vector<>(List.of("Vector")));

    invoker.showElements(new CopyOnWriteArrayList<>(List.of("CopyOnWriteArrayList")));

    }

    public static class Jedi {
        private List<Object> names;
        public Jedi(List names){
            this.names = names;
        }
        void printJediName(){
            this.names.forEach(System.out::println);
        }
    }

    public static class ListInvoker{
        public void showElements (List<String> list){
            list.forEach(System.out::println);
        }
    }
}
