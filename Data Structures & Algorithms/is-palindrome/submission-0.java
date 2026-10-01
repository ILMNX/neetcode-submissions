/*
jadi ada string s, kita return true klo dia palindrome
s itu case insensitive dan ignore tanda baca (jadi hanya alfabet aja dan angka)

brute force:
- string s kita bersihin dulu dari non-alphanumeric character
- setelahnya convert jadi array
- kita reverse
- abisnya kita kita cocokin apakah palindrome pakai hashset
- huruf yang udah muncul di loop depan ke belakang kita cek juga dari belakang ke depan
- return true kalau palindrome

**/


class Solution {
    public boolean isPalindrome(String s) {
        String sCleaned = s.replaceAll("[^a-zA-Z0-9]","");

        char[] charArray = sCleaned.toLowerCase().toCharArray();
        String cNormalArray = "";
        String cReverseArray = "";

        for(int i =0; i < charArray.length; i++){
        
            char normalArray = charArray[i];
             cNormalArray += String.valueOf(normalArray);
            
        }

        for(int j = charArray.length - 1; j >= 0 ; j--){
                char reverseArray = charArray[j];
                 cReverseArray += String.valueOf(reverseArray);
        }

          if(cNormalArray.equals(cReverseArray)){
            return true;
            } else{
            return false;
            }

    }
}
