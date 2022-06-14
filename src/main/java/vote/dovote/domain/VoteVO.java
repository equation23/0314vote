package vote.dovote.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public class VoteVO {
    int vno;
    @Setter
    int pick;
}
