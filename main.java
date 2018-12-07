import java.util.Scanner;

class Armsport {
    public static void main(String args[]) {

        Sportsman sportsmanList[] = new Sportsman[10];
        int slc = 0;

        try (Scanner sc = new Scanner(System.in)) {

            int n;
            do {
                System.out.println("1 - Добавление участников");
                System.out.println("2 - Вывод списка");
                System.out.println("3 - Выход");

                n = sc.nextInt();
                switch (n) {
                    case 1:
                        Sportsman newS = new Sportsman();
                        sportsmanList[slc] = newS.addSportsman();
                        slc++;
                        break;
                    case 2:
                        System.out.println("Добавлено " + slc + " участников");
                        for (int count = 0; count < slc; count++) sportsmanList[count].showSportsman();

                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Введите еще раз");
                    }


            } while (n != 3);
        }
    }

}
