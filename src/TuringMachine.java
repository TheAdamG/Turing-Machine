public class TuringMachine {

  private Tape tape;
  private State[] states;
  private int currentState;

  public TuringMachine(Tape tape, State[] states, int startingState) {
    this.tape = tape;
    this.states = states;
    this.currentState = startingState;
  }


  public void startMachine() {
    System.out.println("START STATE: " + currentState);
    System.out.println(tape);
    StateTransition[] stateTransitions = new StateTransition[0];
    while (currentState > -1) {
      for (State state : states) {
        if (state.getStateNo() == currentState) {
          stateTransitions = state.getStateTransitions();

          String readValue = tape.readTape();
          for (StateTransition stateTransition : stateTransitions) {
            if (stateTransition.getSymbolRead().equals(readValue)) {
              tape.writeTape(stateTransition.getWriteInstruction());
              tape.moveHead(stateTransition.getDirection());
              currentState = stateTransition.getNextState();
              System.out.println("NEXT STATE: " + currentState);
              System.out.println(tape);
              break;
            }
          }
          break;
        }


      }
    }

  }


}
