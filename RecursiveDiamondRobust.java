public class RecursiveDiamondRobust {

    public static void main(String[] args) {

        int maxLeftStars = 25;
        int middleMaxSpaces = 21;

        // Print top row (only stars)
        printLineString(repeat('*', maxLeftStars)); // 25 stars

      
        int left = 11;
        int right;     
        int mid;       
        mid = 3;

        for (; left >= 1; left--) {
            right = left;
            printLineString(repeat('*', left) + repeat(' ', mid) + repeat('*', right));
            mid += 2;
        }

   
        left = 2;
        mid -= 2; 
        for (; left <= 11; left++) {
            printLineString(repeat('*', left) + repeat(' ', mid) + repeat('*', left));
            mid -= 2;
        }

        
        printLineString(repeat('*', maxLeftStars));
    }

    private static String repeat(char ch, int count) {
        if (count <= 0) return "";
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) sb.append(ch);
        return sb.toString();
    }

    
    private static void printLineString(String s) {
        System.out.println(s);
    }
}
