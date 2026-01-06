class Solution {
    String[] ones = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
    String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
    String[] thousands = {"", " Thousand", " Million", " Billion"};

    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        return words(num).substring(1);
    }
    public String words(int n){
        if(n < 20){
            return ones[n];
        }
        if(n < 100){
            return tens[n / 10] + words(n % 10);
        }
        if(n<1000){
            return words(n / 100) + " Hundred" + words(n % 100);
        }
        for(int i=3; i >= 0; i--){
            if(n >= Math.pow(1000,i)){
                return words((int)(n / Math.pow(1000, i))) + thousands[i] + words((int)(n % Math.pow(1000,i)));
            }
        }
        return "";
    }
}