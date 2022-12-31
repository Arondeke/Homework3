public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int variableInt = -123456789;
        byte variableByte = -123;
        short variableShort = -12345;
        long variableLong = 123456789;
        float variableFloat = 1.23456789F;
        double variableDouble = -98765432.1;
        System.out.println("Значение переменной " + "variableInt" + " типа int" + " равно " + variableInt);
        System.out.println("Значение переменной " + "variableByte" + " типа byte" + " равно " + variableByte);
        System.out.println("Значение переменной " + "variableShort" + " типа short" + " равно " + variableShort);
        System.out.println("Значение переменной " + "variableLong" + " типа long" + " равно " + variableLong);
        System.out.println("Значение переменной " + "variableFloat" + " типа float" + " равно " + variableFloat);
        System.out.println("Значение переменной " + "variableDouble" + " типа double" + " равно " + variableDouble);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double variableDouble = 27.12D;
        long variableLong = 987678965549L;
        float variableFloat = 2.786f;
        int variableInt = 569;
        short variableShort = -159;
        char variableChar = 27897;
        byte variableByte = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte teacherOneStudents = 23;
        byte teacherTwoStudents = 27;
        byte teacherThreeStudents = 30;
        int allPaperLists = 480;

        int allStudents = teacherOneStudents + teacherTwoStudents + teacherThreeStudents;
        int paperListOneStudent = allPaperLists / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperListOneStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte efficiencyTime = 2;
        byte efficiencyQuantity = 16;
        String min20 = "20 минут";
        String oneDay = "1 день";
        String threeDay = "3 дня";
        String oneMonth = "1 месяц";

        //производительность за минуту
        int efficiencyMachineOneMin = efficiencyQuantity / efficiencyTime;

        //минут в 1 дне/3 дня/1 месяц
        int min20Min = 20;
        int MinOneDay = 24 * 60;
        int MinThreeDay = MinOneDay * 3;
        int MinOneMonth = MinThreeDay * 10;

        //производительность за 20 минут/1 день/3 дня/1 месяц
        int efficiencyMachine20Min = efficiencyMachineOneMin * min20Min;
        int efficiencyMachineOneDay = efficiencyMachineOneMin * MinOneDay;
        int efficiencyMachineThreeDay = efficiencyMachineOneMin * MinThreeDay;
        int efficiencyMachineOneMonth = efficiencyMachineOneMin * MinOneMonth;

        //вывод сообщений
        System.out.println("За " + min20 + " машина произвела " + efficiencyMachine20Min + " штук бутылок");
        System.out.println("За " + oneDay + " машина произвела " + efficiencyMachineOneDay + " штук бутылок");
        System.out.println("За " + threeDay + " машина произвела " + efficiencyMachineThreeDay + " штук бутылок");
        System.out.println("За " + oneMonth + " машина произвела " + efficiencyMachineOneMonth + " штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte allPots = 120;
        byte potsWhiteOneClass = 2;
        byte potsBrownOneClass = 4;

        //всего банок для 1 класса
        int allClassPots = potsWhiteOneClass + potsBrownOneClass;

        //всего классов
        int allClasses = allPots / allClassPots;

        //всего белых и коричневых банок
        int allPotsWhite = allClasses * 2;
        int allPotsBrown = allClasses * 4;

        //вывод
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allPotsWhite + " банок белой краски и " + allPotsBrown + " банок коричневой краски");

    }
    public static void task6(){
        System.out.println("Задача 6");
        byte quantityBanana = 5;
        byte weithOneBanana = 80;
        short quantityMilk = 2;
        byte weithOneMilk = 105;
        byte quantityCream = 2;
        byte weithOneCream = 100;
        byte quantityEgg = 4;
        byte weithOneEgg = 70;

        //порции отдельных продуктов
        int portionBanana = quantityBanana * weithOneBanana;
        int portionMilk = quantityMilk * weithOneMilk;
        int portionCream = quantityCream * weithOneCream;
        int portionEgg = quantityEgg * weithOneEgg;

        //вся порция
        int allPortionGramm = portionBanana + portionMilk + portionCream + portionEgg;
        float allPortionKiloramm = (portionBanana + portionMilk + portionCream + portionEgg) / 1000f;

        //вывод
        System.out.println("Вес спортзавтрака " + allPortionGramm + " г");
        System.out.println("Вес спортзавтрака " + allPortionKiloramm + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short minLostWeith= 250;
        short maxLostWeith= 500;
        short needLost = 7000;
        int dayLostMin = needLost / maxLostWeith;
        int dayLostMax = needLost / minLostWeith;
        int avgLostDay = (dayLostMax + dayLostMin)/2;

        System.out.println(dayLostMin + " дней уйдет на похудение, если спортсмен будет терять каждый день по " +  maxLostWeith  + " грамм");
        System.out.println(dayLostMax + " дней уйдет на похудение, если спортсмен будет терять каждый день по " +  minLostWeith  + " грамм");
        System.out.println(avgLostDay + " дней в среднем уйдет на похудение");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int zpKristinaOld = 76230;
        int zpDenisOld = 83690;
        int zpMahaOld = 67760;
        int indexEveryYear = 10;
        byte quantityMonthYear = 12;

        //зп индексированная за месяц
        int zpKristinaIndex = zpKristinaOld + zpKristinaOld / indexEveryYear;
        int zpDenisIndex = zpDenisOld + zpDenisOld / indexEveryYear;
        int zpMahaIndex = zpMahaOld + zpMahaOld / indexEveryYear;

        //зп старая за год
        int zpKristinaOldYear = zpKristinaOld * quantityMonthYear;
        int zpDenisOldYear = zpDenisOld * quantityMonthYear;
        int zpMahaOldYear = zpMahaOld * quantityMonthYear;

        //зп индексированная за год
        int zpKristinaIndexYear = zpKristinaIndex * quantityMonthYear;
        int zpDenisIndexYear = zpDenisIndex * quantityMonthYear;
        int zpMahaIndexYear = zpMahaIndex * quantityMonthYear;

        //разница старой и новой зп
        int zpKristinaDifferent = zpKristinaIndexYear - zpKristinaOldYear;
        int zpDenisDifferent = zpDenisIndexYear - zpDenisOldYear;
        int zpMahaDifferent = zpMahaIndexYear - zpMahaOldYear;

        System.out.println("Кристина теперь получает " +  zpKristinaIndex + " рублей. Годовой доход вырос на " + zpKristinaDifferent + " рублей");
        System.out.println("Денис теперь получает " +  zpDenisIndex + " рублей. Годовой доход вырос на " + zpDenisDifferent + " рублей");
        System.out.println("Маша теперь получает " +  zpMahaIndex + " рублей. Годовой доход вырос на " + zpMahaDifferent + " рублей");
    }
}