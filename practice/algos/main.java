package practice.algos;


public class main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sizeOfList1 = 0;
        String list1 = "";
        String list2 = "";
        int sizeOfList2 = 0;
        ListNode temp = l1;
        while(temp != null){
            sizeOfList1 = sizeOfList1 + 1;
            list1 = list1 + temp.val;
            temp = temp.next;

        }

        System.out.println("Size of List 1 is "+ sizeOfList1 + " and numbers are "+ list1);

        temp = l2;
        while(temp != null){
            sizeOfList2 = sizeOfList2 + 1;
            list2 = list2 + temp.val;
            temp = temp.next;

        }

        System.out.println("Size of List 2 is "+ sizeOfList2 + " and numbers are "+ list2);

        list1 = new StringBuilder(list1).reverse().toString();
        list2 = new StringBuilder(list2).reverse().toString();
        System.out.println("Reversed List 1 is "+ list1);
        System.out.println("Reversed List 2 is "+ list2);

        String sum = String.valueOf(Integer.parseInt(list1) + Integer.parseInt(list2));
        System.out.println("Sum is "+ sum);
        sum = new StringBuilder(sum).reverse().toString();
        System.out.println("Reversed Sum is "+ sum);

        ListNode result = new ListNode();
        ListNode current = result;
        for(int i = sum.length() - 1; i >= 0; i--){
            current.next = new ListNode(Character.getNumericValue(sum.charAt(i)));
            current = current.next;
        }

        return result;
    }
}
