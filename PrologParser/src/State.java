import java.util.EnumSet;
import java.util.Set;

public enum State {

    START {
        @Override
        public Set<State> possibleFollowUps() {
            return EnumSet.of(Q1, Q2, Q3);
        }
    },

    Q2 {
        @Override
        public Set<State> possibleFollowUps() {
            return EnumSet.of(Q2, Q1);
        }
    },
    
    Q3 {
        @Override
        public Set<State> possibleFollowUps() {
            return EnumSet.of(Q1,Q2);
        }
    },

    Q1 {
        @Override
        public Set<State> possibleFollowUps() {
            return EnumSet.of(Q3);
        }
    },

    ;
    public Set<State> possibleFollowUps() {
        return EnumSet.noneOf(State.class);
    }

}