public class ThreeStateBusyBeaver {

  public static void main(String[] args) {
    Tape newTape = new Tape(20);
    TuringMachine tm = new TuringMachine(newTape,
        StateTransition.parseStateTransitions("Statetables"
            + "/ThreeStateBusyBeaver.csv"),
        0);

    tm.startMachine();

  }

}
