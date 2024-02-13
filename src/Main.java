public class Main {
    public static void main(String[] args) {
        String str = "              ШалАш         ";
//        System.out.println(isPalindrome(str));
        String anotherStr = "А роз А у п !!! 7а ла71на1лап?уаз О 000 Ра";
        String anotherStr1 = "котутащатуток";
        String anotherStr2 = "коту! тащат УТОк";
//        System.out.println(isPalindrome(getFormattedString(anotherStr)));
        String[] stringArray = { "avc", "joj", "aas", "aba" };
        String[] stringArray1 = new String[]{ "aaa", "bbb", "ccc" };
        System.out.println(getPalindromeFromArray(stringArray));
        System.out.println(getPalindromeFromArray(stringArray1));
    }

    public static boolean isPalindrome(String str) {
        for( int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) != str.charAt(str.length() - i - 1 ) )
                return false;
        }
        return true;
    }

    public static String getFormattedString(String str) {
         String[] strArray = str.trim().toLowerCase().split("");
         for( int i = 0; i < strArray.length; i++ ) {
             if( strArray[i].equals(strArray[i].toUpperCase() ) )
                 strArray[i] = "";
         }
        return String.join("", strArray);
    }

    public static String getPalindromeFromArray(String[] str) {
        for( int i = 0; i < str.length; i++ ) {
            if( isPalindrome(str[i]) )
                return str[i];
        }
            return "";
    }
}