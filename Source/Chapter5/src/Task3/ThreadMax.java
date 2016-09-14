package Task3;

import java.util.Arrays;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: find max for arr
 */
public class ThreadMax extends Thread{
    private int lo, hi;
    private int[] arr;
    private int max = 0;
    
    public ThreadMax(int lo, int hi, int[] arr) {
        super();
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }
    
    @Override
    public void run() {
        int temp = 0;
        int[] t = new int[hi - lo];
        for(int i = lo; i < hi; i++) {
            t[temp] = arr[i];
            temp++;
        }
        Arrays.sort(t);
        max = t[t.length - 1];
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }
    
}
