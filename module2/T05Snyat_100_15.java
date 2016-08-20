package module2;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T05Snyat_100_15 {
    // Если денег на балансе хватает  - то дать снять - если нет то не, но еще есть коммисия 1.5грн
    // (кто может пишите сразу - комиссия будет плавающей)
    // - на счету 100
    // n денег снять, k баланс
    // Баланс = баланс - снятие - комиссия
    // Когда у меня денег не достаточно на счету вернуть -1 - как ошибка или минусовой баланс

    static double withdraw(double balance,double withdrawal){
        double commission = 1.5;
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 30.5;

        double balanceAfter = withdraw(balance, withdraw);

        if(withdraw(balance, withdraw)==0){
            System.out.println("ok");
            System.out.println(balanceAfter);
        }
        else{
            System.out.println("no");
        }

    }
}
// плюс этого решения - добавить кусок новой логики и минимум переписывать