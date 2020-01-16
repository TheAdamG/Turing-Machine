public class State {

    int stateNo;
    StateTransition[] stateTransitions;

    public State(int stateNo, StateTransition[] stateTransitions) {
      this.stateNo = stateNo;
      this.stateTransitions = stateTransitions;
    }


}
