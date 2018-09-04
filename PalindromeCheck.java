class PalindromeCheck {

    public static void main(String[] args){
      System.out.println(new PalindromeCheck().isPalindrome(-121));
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverseInt = 0;
        int preservedValue = x;
        while(x>0){
            reverseInt = ( reverseInt * 10 ) + x%10;
            x=x/10;
        }
        System.out.println(reverseInt);
        return (reverseInt==preservedValue?true:false);
    }
}
