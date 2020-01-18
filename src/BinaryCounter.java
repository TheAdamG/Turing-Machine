public class BinaryCounter {

  public static void main(String[] args) {

    Tape newTape = new Tape(new String[]{"1", "1", "1", "1"});

    StateTransition st01 = new StateTransition(Tape.BLANK, Tape.BLANK, Direction.RIGHT, 1);
    StateTransition st02 = new StateTransition("0", "0", Direction.LEFT, 0);
    StateTransition st03 = new StateTransition("1", "1", Direction.LEFT, 0);
    State s0 = new State(0, new StateTransition[]{st01, st02, st03});

    StateTransition st11 = new StateTransition(Tape.BLANK, "1", Direction.LEFT, 2);
    StateTransition st12 = new StateTransition("0", "1", Direction.RIGHT, 2);
    StateTransition st13 = new StateTransition("1", "0", Direction.RIGHT, 1);
    State s1 = new State(1, new StateTransition[]{st11, st12, st13});

    StateTransition st21 = new StateTransition(Tape.BLANK, Tape.BLANK, Direction.RIGHT,-1);
    StateTransition st22 = new StateTransition("0", "0", Direction.LEFT, 2);
    StateTransition st23 = new StateTransition("1", "1", Direction.LEFT, 2);
    State s2 = new State(2, new StateTransition[]{st21, st22, st23});

    TuringMachine tm = new TuringMachine(newTape, new State[]{s0, s1, s2},
        0);

    tm.startMachine();

  }

}
