public class TuringMachine {

  private Tape tape;
  private StateTransition[] states;
  private int currentState;

  public TuringMachine(Tape tape, StateTransition[] states, int startingState) {
    this.tape = tape;
    this.states = states;
    this.currentState = startingState;
  }


  public void startMachine() {
    System.out.println("START STATE: " + currentState);
    System.out.println(tape);
    while (currentState > -1) {
      for (StateTransition state : states) {
        String readValue = tape.readTape();
        if (state.getState() == currentState && state.getSymbolRead()
            .equals(readValue)) {
          tape.writeTape(state.getWriteInstruction());
          tape.moveHead(state.getDirection());
          currentState = state.getNextState();
          System.out.println("NEXT STATE: " + currentState);
          System.out.println(tape);
          break;
        }
      }
    }

  }


}
