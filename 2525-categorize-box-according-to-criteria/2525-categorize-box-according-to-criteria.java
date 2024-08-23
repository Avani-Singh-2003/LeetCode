class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        
       
        long volume = (long) length * width * height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1_000_000_000) {
            bulky = true;
        }
        
        
        if (mass >= 100) {
            heavy = true;
        }
        if (bulky && heavy) {
            return "Both";
        } else if (bulky) {
            return "Bulky";
        } else if (heavy) {
            return "Heavy";
        } else {
            return "Neither";

    }
    }
}