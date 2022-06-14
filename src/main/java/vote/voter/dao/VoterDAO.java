package vote.voter.dao;

import vote.voter.domain.VoterVO;

public enum VoterDAO {
    INSTANCE;
    private VoterVO[] arr;

    VoterDAO() {
        arr = new VoterVO[4];
        arr[0] = new VoterVO(1, "투표자1");
        arr[1] = new VoterVO(2, "투표자2");
        arr[2] = new VoterVO(3, "투표자3");
        arr[3] = new VoterVO(4, "투표자4");
    }

    public VoterVO[] getArr() {
        return arr.clone();
    }

    public VoterVO getOne(Integer vno) {
        VoterVO result = null;
        for (VoterVO vo : arr) {
            if (vo.getVno() == vno) {
                result = vo;
                break;
            }
        }
        return result;
    }
}
