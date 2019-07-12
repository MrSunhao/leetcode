package solution.s0002addTwoNumbers;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node = node1;
        node.next = new ListNode(4);
        node = node.next;

        node.next = new ListNode(3);
        node = node.next;

        ListNode node2 = new ListNode(5);
        node = node2;
        node.next = new ListNode(6);
        node = node.next;

        node.next = new ListNode(4);
        node = node.next;

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(node1, node2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
