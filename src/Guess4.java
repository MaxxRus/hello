public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        char ignore;
        char ansver = 'S';

        do {
            System.out.println("Задумана буква из диапазона A - Z");
            System.out.print("Попытайтесь ее угадать: ");

            // Получить символ с клавиатуры
            ch = (char) System.in.read();
            // Отбросить все остальный символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == ansver) System.out.println("** ПРАВИЛЬНО **");
            else {
                System.out.print("... Извените, нужная буква находиться ");
                if (ch < ansver)
                    System.out.println("ближе к концу алфаавита");
                else System.out.println("ближе к началу алфаавита");
                System.out.println("Повторите попытку! \n");
            }
        } while (ansver != ch);

    }
}
