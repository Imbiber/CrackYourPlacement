package Strings;

public class FindTheIndexOfTheFirstOccurrence {

        public int strStr(String haystack, String needle) {
            int a=haystack.length();
            int b=needle.length();
            if(b>a)return -1;
            for(int i=0;i<=a-b;i++){
                if(haystack.substring(i,i+b).equals(needle))return i;
            }
            return -1;
            
        }
    
}
