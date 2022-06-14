package vote.candidate.dao;

import vote.candidate.vo.CandidateVO;

public enum CandidateDAO {
    INSTANCE;
    private CandidateVO[] arr;

    CandidateDAO(){
     arr=new CandidateVO[3];
     arr[0]=new CandidateVO(1,"기호1번");
     arr[1]=new CandidateVO(2,"기호2번");
     arr[2]=new CandidateVO(3,"기호3번");
 }

    public CandidateVO[] getArr() {
        return arr.clone();
    }
    public void getOne(Integer num){
        for (CandidateVO vo:arr) {
            if (num==vo.getCno()){
                return;

            }
            
        }

    }
}
