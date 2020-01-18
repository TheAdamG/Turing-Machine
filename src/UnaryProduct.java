public class UnaryProduct {

  public static void main(String[] args) {
    Tape newTape = new Tape(60, new String[]{"1", "1", "1", "1", "1", "X", "1",
        "1", "1", "1"});
    TuringMachine tm = new TuringMachine(newTape,
        StateTransition.parseStateTransitions("Statetables/"
            + "UnaryProduct.csv"),
        0);

    tm.startMachine();

  }

}
