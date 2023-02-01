public class Main {

    public static void main(String[] args){
        int account = 1200;
        int bonus = 1;
        int percent = account / 100 * bonus;
        if (account >= 1000) {
            System.out.println("Итоговая сумма+бонус:" + (account + percent));
        } else {
            System.out.println("Итоговая сумма:" + account);
        }
    }

}