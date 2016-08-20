package module2;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T05Snyatplus_logics {
    static double withdrawBalance(double balance, double test, double commission){
       // double commission = 1.5;
        return balance - test - commission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double test = 30.5;
        double commission = 10.5;

        double balanceAfter = withdrawBalance(balance, test, commission);

        if(balanceAfter >= 0){
            System.out.println("ok");
            System.out.println(balanceAfter);
        }
        else{
            System.out.println("no");
        }

    }
}
