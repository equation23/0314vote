import vote.ui.BasicUI;
import vote.ui.ResultUI;
import vote.ui.TotalUI;
import vote.ui.VoteUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        BasicUI[] arr = new BasicUI[2];
        arr[0] = new VoteUI(scanner);
        arr[1]= new ResultUI(scanner);

        TotalUI totalUI = new TotalUI(arr,scanner);
        totalUI.display();
    }
}