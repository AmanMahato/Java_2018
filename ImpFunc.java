//Two SortedList Merge
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1==null) return l2;
 if(l2==null) return l1;
 if(l1.val<l2.val){
   l1.next = mergeTwoLists(l1.next,l2);
   return l1;
 } else {
   l2.next = mergeTwoLists(l1,l2.next);
   return l2;
 }

 }


//Palindromic Substrings
 public int countSubstrings(String s) {
    int len = s.length();
    if(len==0 || s==null) return 0;
    int count = 0;
    for(int i=0;i<len;i++){
        int low = i;
        int high = i;
        while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            count ++;
            low --;
            high ++;
        }

        low = i;
        high = i+1;
        while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            count ++;
            low --;
            high ++;
        }
    }
