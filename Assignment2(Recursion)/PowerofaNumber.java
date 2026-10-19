public class PowerofaNumber {
    static int POW(int p, int q){
            if(q==0) return 1;
            if(p==0) return 0;
            return p*POW(p, q-1);
    }
    public static void main(String[] args) {
        int p = 2;
        int q = 3;
        System.out.println(POW(p, q));
    }
}
