package vote.ui;

import java.util.Scanner;

public class BasicUI {
    private Scanner scanner;

    public BasicUI(Scanner scanner){
        this.scanner=scanner;
    }
    public void print (String msg){
        System.out.println(msg);
    }
    public void execute(){

    }
}
