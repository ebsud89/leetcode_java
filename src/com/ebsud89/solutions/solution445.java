package com.ebsud89.solutions;

import com.ebsud89.data.ListNode;

public class solution445 {

    public ListNode ll1;
    public ListNode ll2;

    public solution445() {
        ll1 = new ListNode();
        ll2 = new ListNode();
        setListNode();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode node = answer;

        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;

            ListNode temp = new ListNode(sum);
            node.next = temp;
            node = node.next;
        }
        if(carry > 0) {
            ListNode temp = new ListNode(carry);
            node.next = temp;
        }
        return answer.next;

    }

    public void setListNode() {
        ListNode la1 = new ListNode(3);
        ListNode la2 = new ListNode(4, la1);
        ListNode la3 = new ListNode(2, la2);
        ListNode la4 = new ListNode(7, la3);

        ListNode lb1 = new ListNode(4);
        ListNode lb2 = new ListNode(6, lb1);
        ListNode lb3 = new ListNode(5, lb2);

        this.ll1.next = la4;
        this.ll2.next = lb3;
    }


    public void printListNode() {
        System.out.println(
                ll1.next.val
        );
    }
}
