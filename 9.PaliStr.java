public class PaliStr {
     public static void main(String[] args) {
         String str = "assssa";
         char[] str1 = new char[str.length()];  Specify the size of the array
         int j = 0;
         boolean isPalindrome = true;
         for (int i = str.length() - 1; i >= 0; i--) {  Use i-- to decrement i
             if(str.charAt(i)!=str.charAt(j))
             {
                 isPalindrome = false;
             }
             j++;
         }
       
         if (isPalindrome) {
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }
     }
