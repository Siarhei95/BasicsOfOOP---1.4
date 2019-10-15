package task1_4;

public class Cave {
    int []array = new int[0];

    public void showTreasure(Treasure treasure) {
        int count = treasure.getCount();
        array = new int[count - 1];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 1000));
            x++;
            System.out.print(array[i] + ",");
            if (x == 20) {
                System.out.println("");
                x = 0;
            }
        }
    }

    public void showMostExpensive(){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void showYourChoice(int finder){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (finder == array[i]) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Found a treasure! You can buy :)");
        } else {
            System.out.println("Did not find the treasure! Next time :(");
        }
    }
}