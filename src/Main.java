import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 1.2f;
        double f = 2.1;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно "+ f);

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

        short color = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int paintForClass = whiteColor + brownColor;
        int classRoom = color / paintForClass;
        int allWhitePain = classRoom * whiteColor;
        int allBrownPain = classRoom * brownColor;
        System.out.println("в школе, где " + classRoom + " классов, нужно " + allWhitePain + " банок белой краски и " + allBrownPain + " банок коричневой краски");

        int banana = 80;
        int bananaWeight = banana * 5;
        int milk = 105;
        int milkWeight = milk * 2;
        int iceCream = 100;
        int iceCreamWeight = iceCream * 2;
        int eggs = 70;
        int eggsWeight = eggs * 4;
        double productWeights = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        double productWeightsKG = productWeights / 1000;
        System.out.println("Вес завтрака составляет " + productWeights + " грамм или " + productWeightsKG + " кг");

        int loseWeight = 7000;
        int firstRation = 250;
        int twoRation = 500;
        int daysOfWeightLossWithTheFirstDiet = loseWeight / firstRation;
        int daysOfWeightLossWithTheTwoDiet = loseWeight / twoRation;
        int averageRation = (firstRation + twoRation) / 2;
        int dayAverage = (daysOfWeightLossWithTheFirstDiet + daysOfWeightLossWithTheTwoDiet) / 2;
        System.out.println("Если спортсмен будет терять по 250 грамм ежедневно, то потребуется " + daysOfWeightLossWithTheFirstDiet + " дней для похудения");
        System.out.println("Если спорстмен будет терять по 500 грамм ежедневно, то потребуется " + daysOfWeightLossWithTheTwoDiet + " дней для похудения");
        System.out.println("В среднем потребуется " + dayAverage + " день на похудение");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double newMasha = (masha * 0.1) + masha;
        double newDenis = (denis * 0.1) + denis;
        double newKristina = (kristina * 0.1) + kristina;
        double incomeDifferenceMasha = newMasha - masha;
        double incomeDifferenceDenis = newDenis - denis;
        double incomeDifferenceKristina = newKristina - kristina;
        System.out.println("Маша теперь получает " + newMasha + " рублей.Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newDenis + " рублей.Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newKristina + " рублей.Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");
    }






    }



