package 贪心算法;

import java.util.LinkedList;
import java.util.Queue;

public class _660柠檬水找零 {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for (int bill : bills) {
            if (bill==5) five++;
            if (bill==10) {
                if (five == 0) return false;
                five--;
                ten++;

            }else {
                if (five>0&&ten>0) {
                    five--;ten--;
                }else if (five>=3){
                        five=five-3;

                }else return false;
            }
        }
        return true;
    }
}
