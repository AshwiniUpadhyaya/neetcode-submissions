class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String st:details){
            int tensplace=st.charAt(11)-'0';
            int onesplace=st.charAt(12)-'0';
            int age=onesplace + 10*tensplace;
            /*If a person's age in the string is "65":
            ten becomes '6' - '0' = 6
            one becomes '5' - '0' = 5
            age = 5 + (10 * 6) = 5 + 60 = 65*/
            if(age>60){
                res++;
            }
        }
        return res;
    }
}
/*public class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String d : details) {
            if (Integer.parseInt(d.substring(11, 13)) > 60) {
                res++;
            }
        }
        return res;
    }
}*/