package vote.ui;

import java.util.Scanner;

public class TotalUI {
    private BasicUI[] arr;
    private Scanner scanner;

    public TotalUI(BasicUI[] arr, Scanner scanner) {
        this.arr = arr;
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("0: 투표, 1:결과");

        int idx = Integer.parseInt(scanner.nextLine());

        if (idx == -1) {
            System.out.println("Exit...............");
            return;
        }


        arr[idx].execute();

        display();
    }
}
