package vote.dovote.service;

import lombok.RequiredArgsConstructor;
import vote.candidate.dao.CandidateDAO;
import vote.dovote.dao.VoteDAO;
import vote.dovote.domain.VoteVO;
import vote.voter.dao.VoterDAO;
@RequiredArgsConstructor
public enum VoteService {
    INSTANCE;
    private VoteDAO voteDAO =VoteDAO.INSTANCE;
    private VoterDAO voterDAO = VoterDAO.INSTANCE;
    private CandidateDAO candidateDAO = CandidateDAO.INSTANCE;

    public void voting(VoteVO voteVO){
        Integer candidate =voteVO.getVno();
        candidateDAO.getOne(candidate);

        voteDAO.add(voteVO);
    }

}
