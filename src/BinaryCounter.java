public class BinaryCounter {

  public static void main(String[] args) {

    Tape newTape = new Tape(10, new String[]{"1", "1", "1", "1"});
    TuringMachine tm = new TuringMachine(newTape,
        StateTransition.parseStateTransitions("Statetables/binarycounter.csv")
        , 0);

    tm.startMachine();

  }
}
