package geekbrains_home_work;

public class Main {

    public static void main(String[] args) {

        numbersFrom10To20();
        positiveOrNegative();
        positiveTrueNegativeFolse();
        printStrings();
        leapYear();
        }

        public static boolean numbersFrom10To20 (){
            int a = 30;
            int b = 10;
            return a + b >= 10 && a + b <= 20;
        }

        public static void positiveOrNegative() {
            int c = 4;
            if (c >= 0){
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        public static boolean positiveTrueNegativeFolse(){
        int d = 5;
        return d >= 0;
        }

        public static void printStrings(){
        for (int e = 0; e < 5; e ++ ) {
            System.out.println("Печатаем строку");
            }
        }

        public static boolean leapYear(){
        int j = 2020; // год , который нужно проверить
        int k = j % 400;
        int l = j % 4;
        int m = j % 100;
        if (k == 0 || l == 0 && m != 0){
            return true;
        }
        return false;
        }

}



