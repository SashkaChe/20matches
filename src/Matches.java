import java.io.*;

public class Matches {
    public static void main(String[] args)  throws Exception {

        int count = 20;
        int player = 20;

        // цикл работает до тех пор пока количество спичек (count) не уменьшится до 1
        while(count > 1) {

            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

            // если число (player) четное, то ход компьютера, а иначе (else), ход человека
            if (player%2==0) {


                // для победы копьютеру всегда нужно оставлять для человека num = num + 4 спичек (т.е. 1, 5, 9, 13 , 17 и тд.)
                int computer = 0;
                int num = 1;

                for (int i = 0; ; i++) {
                    num = num + 4;

                    if (num > count) {
                        computer = count - (num - 4);
                        break;
                    }

                }


                System.out.println("На столе осталось " + count + " спичек \n - Количество выбранных компьютером спичек = " + computer);
                count = count - computer;
                player--;
                if (count < 2) {
                    System.out.println("Осталась 1 спичка. Человек проиграл.");
                }

            } else {


                System.out.print("На столе осталось " + count + " спичек \n - Ход игрока. Введите количество списек: ");
                int x = Integer.parseInt(obj.readLine());

              if (x < 1 || x > 3) {
                    rep : while (true) {
                    System.out.print("Введите число от 1 до 3: ");
                    int y = Integer.parseInt(obj.readLine());
                    if (y < 1 || y > 3) {
                    continue rep;
                    }

                    count = count - y;
                    player--;
                    break;
}
                } else {

                    count = count - x;
                    player--;
                    if (count < 2) {
                        System.out.println("Осталась 1 спичка. Компьютер проиграл.");
                    }
                }
            }

        }

    }

}

