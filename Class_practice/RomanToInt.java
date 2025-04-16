import java.util.HashMap;

public class RomanToInt {
    public static int RomanInt(String s){
        HashMap<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            int current = romanMap.get(s.charAt(i));


            if(i + 1 < s.length()){
                int next = romanMap.get(s.charAt(i + 1));

                if(current < next){
                    result -= current;
                }else{
                    result += current;
                }
            }else{
                result += current;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "VI";
        int result = RomanInt(s);

        System.out.println("Roman number: " + s + " of Integer number: " + result);
        
    }
}
