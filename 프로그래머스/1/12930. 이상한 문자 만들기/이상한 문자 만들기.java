class Solution {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(character == ' '){
                flag = 0;
                sb.append(' ');
            }
            else{
                if (flag % 2 == 0){
                    character = Character.toUpperCase(character);

                }else{
                    character = Character.toLowerCase(character);
                }
                sb.append(character);
                flag++;
            }
        }


        return sb + "";
    }
}