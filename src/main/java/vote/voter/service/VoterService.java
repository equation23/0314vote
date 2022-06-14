package vote.voter.service;

import lombok.RequiredArgsConstructor;
import vote.voter.dao.VoterDAO;
import vote.voter.domain.VoterVO;
@RequiredArgsConstructor
public enum VoterService {
    INSTANCE;
    private VoterDAO voterDAO = VoterDAO.INSTANCE;
    public VoterVO[] showVoter(){
       return voterDAO.getArr();
    }
    public VoterVO selectVoter(Integer vno){
        return voterDAO.getOne(vno);

    }
}
