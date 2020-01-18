public class BinaryCounter {

  public static void main(String[] args) {

    Tape newTape = new Tape(10, new String[]{"1", "1", "1", "1"});

    StateTransition st01 = new StateTransition(0, Tape.BLANK, Tape.BLANK, Direction.RIGHT, 1);
    StateTransition st02 = new StateTransition(0, "0", "0", Direction.LEFT, 0);
    StateTransition st03 = new StateTransition(0, "1", "1", Direction.LEFT, 0);


    StateTransition st11 = new StateTransition(1, Tape.BLANK, "1", Direction.LEFT, 2);
    StateTransition st12 = new StateTransition(1, "0", "1", Direction.RIGHT, 2);
    StateTransition st13 = new StateTransition(1, "1", "0", Direction.RIGHT, 1);


    StateTransition st21 = new StateTransition(2, Tape.BLANK, Tape.BLANK, Direction.RIGHT,-1);
    StateTransition st22 = new StateTransition(2, "0", "0", Direction.LEFT, 2);
    StateTransition st23 = new StateTransition(2, "1", "1", Direction.LEFT, 2);

    TuringMachine tm = new TuringMachine(newTape, new StateTransition[]{st01, st02, st03, st11, st12, st13, st21, st22, st23},0);

    tm.startMachine();

  }

}
