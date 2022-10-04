import java.math.BigInteger;
import java.util.Scanner;

class Solution {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            addBinary(scanner.nextLine(), scanner.nextLine());
        }
        public static String addBinary(String a, String b) {
            BigInteger bg1 = new BigInteger(String.valueOf(a),2);
            BigInteger bg2 = new BigInteger(String.valueOf(b),2);
            return String.format("%8s", bg1.add(bg2).toString(2)).replace(' ', ' ').trim();

        }
    }