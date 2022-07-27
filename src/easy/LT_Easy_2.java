package easy;

public class LT_Easy_2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public static void print(LT_Easy_2 list) {
            Node current = list.head;
            System.out.println("LinkedList : ");
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }

        public static void main(String[] args) {
            LT_Easy_2 l1 = new LT_Easy_2();
            LT_Easy_2 l2 = new LT_Easy_2();
            l1 = insert(l1,2);
            l1 = insert(l1,4);
            l1 = insert(l1,3);

            l2 = insert(l2,5);
            l2 = insert(l2,6);
            l2 = insert(l2,4);

            print(l1);
            print(l2);
            
            //reverse data for each ll
            reverse(l1,l2);
            //sum values
            //print sum as ll in reverse order
        }

        private static void reverse(LT_Easy_2 l1, LT_Easy_2 l2) {
            Node currentL1 = l1.head;
            Node currentL2 = l2.head;
            while (currentL1 != null && currentL2 != null) {
                calculateSum();
                currentL1 = currentL1.next;
                currentL2 = currentL2.next;
            }
        }

        private static void calculateSum() {
        }

        private static LT_Easy_2 insert(LT_Easy_2 list, int data) {
            Node node = new Node(data);
            if(list.head == null){
                list.head = node;
            }
            else{
                Node last = list.head;
                while(last.next!=null) {
                    last = last.next;
                }
                last.next = node;
            }
            return list;
        }
    }


}
