//Дракон и его сокровища.  Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.


package task1_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dragons dragons = new Dragons("Rex");
        Treasure treasure = new Treasure(100);
        Cave cave = new Cave();

        System.out.println("A dragon named "+dragons.getDragon()+" enters the cave to find the treasure.");

        System.out.println("\n"+dragons.getDragon()+" asks to show the cave all the cost of treasures: ");
        cave.showTreasure(treasure);

        System.out.println();
        System.out.println("\n"+dragons.getDragon()+" asks to show the most expensive treasure: ");
        cave.showMostExpensive();

        System.out.print("\n"+dragons.getDragon()+", what amount of treasure can you afford? Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int finder = sc.nextInt();
        cave.showYourChoice(finder);
    }
}
