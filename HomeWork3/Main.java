package HomeWork3;

public class Main {
    public static void main(String[] args) {

        LinkedListJeneric<String> list = new LinkedListJeneric<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        LinkedListJeneric<String> listRevers = new LinkedListJeneric<>();
        listRevers = list.reversed();
        System.out.println(listRevers);

    }
}