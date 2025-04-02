public class StringPalindrome {
    static boolean isPalindrome(String str){
        int j=str.length()-1;
        for(int i=0;i<str.length()-1;i++,j--){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str="raceca";
        if(isPalindrome(str)){System.out.println("Palindrome");}
        else{
            System.out.println("not a palindrome");
        }
    }
}
