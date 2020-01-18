public class ThreeStateBusyBeaver {

  public static void main(String[] args) {

    Tape newTape = new Tape(20);
    StateTransition[] transitions = new StateTransition[]{

        new StateTransition(0, Tape.BLANK, "1", Direction.LEFT, 1),
        new StateTransition(0, "0", Tape.BLANK, Direction.STAY, 0),
        new StateTransition(0, "1", "1", Direction.STAY, -1),

        new StateTransition(1, Tape.BLANK, Tape.BLANK, Direction.LEFT, 2),
        new StateTransition(1, "0", Tape.BLANK, Direction.STAY, 0),
        new StateTransition(1, "1", "1", Direction.LEFT, 1),

        new StateTransition(2, Tape.BLANK, "1", Direction.RIGHT, 2),
        new StateTransition(2, "0", Tape.BLANK, Direction.STAY, 0),
        new StateTransition(2, "1", "1", Direction.RIGHT, 0),
    };

    TuringMachine tm = new TuringMachine(newTape, transitions, 0);

    tm.startMachine();


  }

}
