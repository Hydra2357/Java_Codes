package JavaByCoderArmy;

public class Arrays {
    public static void main(String args[]) {
        int[] rollNums = new int[3];
        int x = 1010;

        for(int i = 0; i< rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }

        for(int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }
    }
}