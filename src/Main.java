public class Main {
    public static void main(String[] args) {

        //task1
        byte byteMax = 127;
        System.out.println(byteMax);
        short shortMax = 32767;
        System.out.println(shortMax);
        int intMax = 2147483647;
        System.out.println(intMax);
        long longMax = 9223372036854775807L;
        System.out.println(longMax);
        float floatMax = 0.1234567f;
        System.out.println(floatMax);
        double doubleMax = 0.1234567890123456;
        System.out.println(doubleMax);

        //task2
        float n1 = 27.12f;
        System.out.println(n1);
        long n2 = 987678965549L;
        System.out.println(n2);
        float n3 = 2.786f;
        System.out.println(n3);
        short n4 = 569;
        System.out.println(n4);
        short n5 = -159;
        System.out.println(n5);
        short n6 = 27897;
        System.out.println(n6);
        byte n7 = 67;
        System.out.println(n7);

        //task3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int studentsTotal = class1 + class2 + class3;
        short paperTotal = 480;
        int paperEach = paperTotal / studentsTotal;
        System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги");

        //task4
        byte bottlesPerCycle = 8;
        byte cycles1 = 20;
        int bottlesProduced1 = bottlesPerCycle * cycles1;
        System.out.println("За " + cycles1 + " минут машина произвела " + bottlesProduced1 + " штук бутылок");
        byte days = 1;
        int cycles2 = days * 1440;
        int bottlesProduced2 = bottlesPerCycle * cycles2;
        System.out.println("За сутки машина произвела " + bottlesProduced2 + " штук бутылок");
        days = 3;
        int cycles3 = days * 1440;
        int bottlesProduced3 = bottlesPerCycle * cycles3;
        System.out.println("За " + days + " дня машина произвела " + bottlesProduced3 + " штук бутылок");
        byte months = 1;
        int cycles4 = months * 31 * 1440;
        int bottlesProduced4 = bottlesPerCycle * cycles4;
        System.out.println("За " + months + " месяц машина произвела " + bottlesProduced4 + " штук бутылок");

        //task5
        byte cansTotal = 120;
        byte cansPerRoom = 6;
        int roomsTotal = cansTotal / cansPerRoom;
        int whiteCansTotal = roomsTotal * 2;
        int brownCansTotal = roomsTotal * 4;
        System.out.println("В школе, где " + roomsTotal + " классов, нужно " + whiteCansTotal + " банок белой краски и " + brownCansTotal + " банок коричневой краски");

        //task6
        byte bananas = 5;
        int bananasWeight = bananas * 80;
        short milk = 200;
        int milkWeight = (milk/100)*105;
        byte plombir = 2;
        int plombirWeight = plombir * 100;
        byte eggs = 4;
        int eggsWeight = eggs * 70;
        int TotalWeightGrams = bananasWeight + milkWeight + plombirWeight + eggsWeight;
        System.out.println(TotalWeightGrams + "g");
        float TotalWeightKilograms = TotalWeightGrams / 1000f;
        System.out.println(TotalWeightKilograms + "kg");

        //task7
        short weightLossTotal = 7000;
        short lossPerDay1 = 250;
        int weightLossTime1 = weightLossTotal / lossPerDay1;
        System.out.println(weightLossTime1);
        short lossPerDay2 = 500;
        int weightLossTime2 = weightLossTotal / lossPerDay2;
        System.out.println(weightLossTime2);
        int weightLossTimeAverage = (weightLossTime1 + weightLossTime2) / 2;
        System.out.println(weightLossTimeAverage);

        //task8
        int salary = 67760;
        int salaryNewMasha = salary + (salary / 10);
        int salaryDifferenceMasha = salaryNewMasha - salary;
        System.out.println("Маша теперь получает " + salaryNewMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        salary = 83690;
        int salaryNewDenis = salary + (salary / 10);
        int salaryDifferenceDenis = salaryNewDenis - salary;
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        salary = 76230;
        int salaryNewCristina = salary + (salary / 10);
        int salaryDifferenceCristina = salaryNewCristina - salary;
        System.out.println("Кристина теперь получает " + salaryNewCristina + " рублей. Годовой доход вырос на " + salaryDifferenceCristina + " рублей");






    }
}