package practice;

public class ReverseBit {

	public static int reverseBits(int n) {
        int c=n;
        int i=0;
        int tmp=0;
        while(i<32)
        {
            tmp=((c&1)<<(31-i))|tmp;
            c=c>>1;
            System.out.println(Integer.toBinaryString(tmp));
            i++;
        }
        return tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		System.out.println(Integer.toBinaryString(i));
		i=reverseBits(i);
		System.out.println(Integer.toBinaryString(i));
	}

}
