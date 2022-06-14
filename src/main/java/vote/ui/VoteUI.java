package vote.ui;

import vote.candidate.service.CandidateService;
import vote.dovote.domain.VoteVO;
import vote.dovote.service.VoteService;
import vote.voter.service.VoterService;

import java.util.Arrays;
import java.util.Scanner;

public class VoteUI extends BasicUI {
    private VoteService voteService = VoteService.INSTANCE;
    private VoterService voterService =VoterService.INSTANCE;
    private CandidateService candidateService =CandidateService.INSTANCE;
    private Scanner scanner = new Scanner(System.in);

    public VoteUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        super.execute();
        print("후보를 보여줍니다");
        System.out.println(Arrays.toString(candidateService.getList()));
        print("사용자를 확인합니다.");
        System.out.println(Arrays.toString(voterService.showVoter()));
        print("사용자를 선택합니다.");
        int user =Integer.parseInt(scanner.nextLine());
        print("후보를 뽑습니다");
        int candidatenum =Integer.parseInt(scanner.nextLine());

        VoteVO voteVO = new VoteVO(user,candidatenum);
        voteService.voting(voteVO);
    }
}
