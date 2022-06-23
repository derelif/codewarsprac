import java.util.Arrays;

class LongestConsec {

    /*
    You are given an array(list) strarr of strings and an integer k.
    Your task is to return the first longest string consisting of k
    consecutive strings taken in the array.
     */

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || strarr.length == 0 || k <= 0)
            return "";
        String consec = "";
        boolean stop = false;
        int maxlength = 0;
        String maxConsec = "";
        for(int i = 0; i < strarr.length; i++){
            consec = "";
            for(int j = 0; j < k; j++){
                if(i+j >= strarr.length){
                    stop = true;
                    break;
                }
                consec += strarr[i+j];
            }
            if(stop){
                break;
            } else if(consec.length() > maxlength){
                maxlength = consec.length();
                maxConsec = consec;
            }

        }
        return maxConsec;
    }
}