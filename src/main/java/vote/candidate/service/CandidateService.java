package vote.candidate.service;

import lombok.RequiredArgsConstructor;
import vote.candidate.dao.CandidateDAO;
import vote.candidate.vo.CandidateVO;
@RequiredArgsConstructor
public enum CandidateService {
    INSTANCE;
private CandidateDAO candidateDAO = CandidateDAO.INSTANCE;
public CandidateVO[] getList(){
    return candidateDAO.getArr();
}
}
