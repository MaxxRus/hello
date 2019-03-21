public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " + ch);
        /*int i;
        System.out.println("Для остановки нажмите клавишу \"S\"");
        for (i=0;(char) System.in.read() != 'S'; i++)
            System.out.println("проход № " + i);
            */
        do {
            System.out.print("Нажмите клавишу, а затем ENTER: ");
            ch = (char) System.in.read();

        } while (ch != 'q');
    }
}
