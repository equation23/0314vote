package vote.ui;

import vote.dovote.dao.VoteDAO;
import vote.dovote.service.VoteService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ResultUI extends  BasicUI{
    private VoteDAO voteDAO = VoteDAO.INSTANCE;
    public ResultUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        super.execute();
        print("결과확인");
        System.out.println(Arrays.toString(new ArrayList[]{voteDAO.getVoArrayList()}));
    }
}
