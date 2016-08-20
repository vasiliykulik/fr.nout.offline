package module2;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T04foreachMethod_String {
    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000) {
                sum += balance;
            }
        }

        return sum;
    }

    static String getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        for (int i = 0; i < balances.length; i++){
            for (int j=0; j<result.length; j++) {
                if (balances[j] > 1000) result[i] = names[j];
            }
    }
    return result;
}
    public static void main(String[] args) {
        // создадим owner names
        int[] balances = {2300, 2345, 456, 346, 453354};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 2345, 6, 346, 45354};

        for(String name)
        System.out.println(balancesSum(balances1));

    }

}

