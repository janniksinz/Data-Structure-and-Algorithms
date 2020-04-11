public class TestSingleLinkedList
{
    public static void main(String[] args) {

        SingleLinkedList<Integer> integer_list = new SingleLinkedList<>(Integer.class);
        integer_list.addElement(0,2);
        System.out.println(integer_list);
    }

}
