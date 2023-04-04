// Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс. 
// Список должен содержать элементы со ссылкой на следующий элемент (если показалось мало, то реализовать ссылку и на предыдущий элемент)

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
 
        DoublyLinkedList list = new DoublyLinkedList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");
        list.add("data5");
        list.add("data6");
 
        list.add(1, "data2_1");
        list.add(4, "data4_1");
 
 
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
 
    }
}