package String.Easy;

//String easy questions
//Find the index of the first occurrence in a string
public class Index_of_first28 {

    static int found(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sadbut";
        int res = found(haystack, needle);

        System.out.println(res);
    }

}
