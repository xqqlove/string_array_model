package myarray;


import java.util.Arrays;


public class TestArray{
    public static final int sz = 15;
    public static void show(Object[] t){
        System.out.println(Arrays.toString(t));
    }
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static void main(String[] args) {
        int[] a1 = new int[sz];
        Arrays.fill(a1, 1);
        int[] a2 = Arrays.copyOf(a1, a1.length);
        System.out.println(a2);
        String[] s=new String[]{"haha","lalal"};
        String[] b;
        String [] array={"hello","world"};
        String arr[]={"hello","world"};
        if (true){
            int x=10;
            if (true)
            {
                int y=100;
            }
        }
        int z;
//        System.out.println(Arrays.toString(b));
//        show(a1);
//        show(a2);
    }


}
