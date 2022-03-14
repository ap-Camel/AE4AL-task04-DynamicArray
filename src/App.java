public class App {
    public static void main(String[] args) throws Exception {

        arrayList<String> array = new arrayList<String>(2);

        array.add("hello");
        array.add("hi");
        array.add("how are you?");

        array.print();

        array.clear();
        array.print();
    }
}
