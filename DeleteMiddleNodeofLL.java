class DeleteMiddleNodeofLL{
    public static void main(String[] args) {
        ListNode head=new ListNode(10);        
        ListNode first=new ListNode(10);        
        ListNode second=new ListNode(10);        
        ListNode third=new ListNode(10);        
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=null;
        ListNode ans=deleteMiddle(head);
        System.out.println(ans);

    }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow==head){
            return null;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(head!=null){
            if(head.next==slow){
                prev=prev.next;
                head=head.next.next;
                prev.next=head;
                break;
            }
            else{
                prev=prev.next;
                head=head.next;
            }
        }
        prev.next=head;
        return dummy.next;
    }
}
class ListNode{
    int data;
    ListNode next;
    ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
    ListNode(int data){
        this.data=data;
    }
}