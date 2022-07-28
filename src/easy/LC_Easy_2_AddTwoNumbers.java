package easy;

public class LC_Easy_2_AddTwoNumbers {
    static class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
            next = null;
        }

        private static Node addTwoList(Node l1, Node l2) {
            //add code here
            Node result = new Node();
            Node first = l1;
            Node second = l2;
            int divider = 0;
            int remainder = 0;
            Node response = result;
            while (first != null || second != null) {
                int firstVal = (first != null) ? first.data : 0;
                int secVal = (second != null) ? second.data : 0;

                int sum = firstVal + secVal + divider;//2+5+0 = 7
                divider = sum / 10; // 7/10 = 0.7
                remainder = sum % 10;//7%10 = 3
                /**understand this in detail**/
                response.next = new Node(remainder);
                response = response.next;
                if (first != null) first = first.next;//iteration linked-list
                if (second != null) second = second.next;//iteration linked-list
            }
            if (divider > 0) response.next = new Node(divider);
            return result.next;
        }
    }
}
