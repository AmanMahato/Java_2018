public class IsUnique{

    public static void main(String[] args){
        System.out.println(new IsUnique().isUnique("ksham"));
    }

    /*This function is used to check if the input string has any character repeated
    */
    static boolean isUnique(String input){
        boolean[] boo = new boolean[256];
        for(int i=0;i<input.length();i++){
            if(!boo[input.charAt(i)]){
              boo[input.charAt(i)] = true;
            } else {
              return false;
            }
        }
        return true;
    }

}
