public class State {

    private int stateNo;
    private StateTransition[] stateTransitions;

    public State(int stateNo, StateTransition[] stateTransitions) {
      this.stateNo = stateNo;
      this.stateTransitions = stateTransitions;
    }

  public int getStateNo() {
    return stateNo;
  }

  public StateTransition[] getStateTransitions() {
    return stateTransitions;
  }
}
