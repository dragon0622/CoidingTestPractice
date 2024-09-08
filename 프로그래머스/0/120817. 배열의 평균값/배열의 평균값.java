class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int item : numbers){
            answer += item;
        }
          
        answer = answer / numbers.length;
        
        return answer;
    }
}
