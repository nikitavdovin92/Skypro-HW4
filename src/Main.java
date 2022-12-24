public class Main {
    public static void main(String[] args) {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 1.2f;
        double f = 2.1;
        System.out.println("Значение переменной a с типом int равно 1");
        System.out.println("Значение переменной b с типом byte равно 2");
        System.out.println("Значение переменной c с типом short равно 3");
        System.out.println("Значение переменной d с типом long равно 4L");
        System.out.println("Значение переменной e с типом float равно 1.2f");
        System.out.println("Значение переменной f с типом double равно 2.1");

        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.println("Переменная g равна " + g);
        System.out.println("Переменная h равна " + h);
        System.out.println("Переменная i равна " + i);
        System.out.println("Переменная j равна " + j);
        System.out.println("Переменная k равна " + k);
        System.out.println("Переменная l равна " + l);
        System.out.println("Переменная m равна " + m);

        byte lyudmilaPavlovna = 23;
        short annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        short paper = 480;
        int pupils = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int papersForStudent = paper / pupils;
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");

        short machinePerformanceInTwoMinutes = 16;
        int machinePerformanceInTwentyMinutes = machinePerformanceInTwoMinutes * 10;
        int machinePerformanceInOneDay = machinePerformanceInTwentyMinutes * 72;
        int machinePerformanceInThreeDays = machinePerformanceInOneDay * 3;
        float averageDaysPerMonth = 30.4167f;
        double machineProducedInMonth = machinePerformanceInOneDay * averageDaysPerMonth;
        System.out.println("За 20 минут машина произвела " + machinePerformanceInTwentyMinutes + " бутылок");
        System.out.println("За сутки машина произвела " + machinePerformanceInOneDay + " бутылок");
        System.out.println("За три дня машина произвела " + machinePerformanceInThreeDays + " бутылок");
        System.out.println("Машина произвела за месяц " + machineProducedInMonth + " бутылок");










    }



}
