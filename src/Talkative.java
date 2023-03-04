public class Talkative implements Runnable{
    int a ;

    public Talkative(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        int nbr=0 ;
        for (int i=0 ; i<100 ; i++){
            System.out.println(a);
            nbr = i;
        }
    }


}
