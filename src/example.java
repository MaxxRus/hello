public class example {
    /* Таблица перевода дюймов в мерт
    каждый 12 дюймов пробел
     */
    public static void main(String[] args) {
        double inch;
        int fut;
        fut = 0;
        int metr;
        for (metr = 1; metr <= 100; metr++) {
            inch = metr * 39.37;
            System.out.println(metr + " метр соответствует " + inch + " дюймов");
            fut++;
            if (fut == 12) {
                System.out.println();
                fut = 0;
            }
        }
    }
}

