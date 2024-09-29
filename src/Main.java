//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int bonusChoc = 3;
        int chocol = money / price;
        int wrappers = chocol;

        // Пока у нас есть достаточно оберток для обмена
        while (wrappers >= bonusChoc) {
            // Обмен оберток на шоколадки
            int newChocolates = wrappers / bonusChoc;
            // Обновляем количество шоколадок
            chocol += newChocolates;

            // Обновляем количество оберток
            wrappers = newChocolates + (wrappers % bonusChoc);
        }
        System.out.println(chocol);
    }
}