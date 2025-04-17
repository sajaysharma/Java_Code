public class Program_15 {
    public static String ToRoman(int num){
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9,  5,  4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L", "XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i < values.length && num > 0; i++){
            while(num >= values[i]){
                num = num - values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        int num = 12;

        String result = ToRoman(num);
        System.out.println("Integer number: " + num + " In Roman: " + result);
    }
}
