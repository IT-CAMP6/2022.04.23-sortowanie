import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        int[] tab2 = new int[100];
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            tab2[i] = tab[i];
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();

        int loopCounter1 = 0;
        int changeCounter1 = 0;
        boolean flag;
        do {
            loopCounter1++;
            flag = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    flag = true;
                    changeCounter1++;
                }
            }
        } while (flag);


        int loopCounter2 = 0;
        int changeCounter2 = 0;
        flag = true;
        while (flag) {
            loopCounter2++;
            flag = false;
            for (int i = 0; i < tab2.length - 1; i++) {
                int j = tab2.length - 1 - i;
                if (tab2[i] > tab2[i + 1]) {
                    int temp = tab2[i];
                    tab2[i] = tab2[i + 1];
                    tab2[i + 1] = temp;
                    flag = true;
                    changeCounter2++;
                }
                if(tab2[j-1] > tab2[j]) {
                    int temp = tab2[j];
                    tab2[j] = tab2[j-1];
                    tab2[j-1] = temp;
                    flag = true;
                    changeCounter2++;
                }
            }
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }

        System.out.println();

        for(int element : tab2) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("LoopCounter1 : " + loopCounter1);
        System.out.println("ChangeCounter1: " + changeCounter1);

        System.out.println("LoopCounter2 : " + loopCounter2);
        System.out.println("ChangeCounter2: " + changeCounter2);
    }
}
