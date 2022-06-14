package vote.dovote.dao;

import vote.dovote.domain.VoteVO;

import java.util.ArrayList;

public enum VoteDAO {
    INSTANCE;
    private ArrayList<VoteVO> voArrayList;
    VoteDAO(){
        voArrayList = new ArrayList<>();

    }
    public void add(VoteVO voteVO){
        voArrayList.add(voteVO);
    }

    public ArrayList<VoteVO> getVoArrayList() {
        return (ArrayList<VoteVO>) voArrayList.clone()  ;
    }
}
