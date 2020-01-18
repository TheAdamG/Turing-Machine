public class UnaryProduct {

  public static void main(String[] args) {

    Tape newTape = new Tape(new String[]{"1","1", "1", "1", "1", "X", "1", "1", "1", "1"});

    StateTransition st01 = new StateTransition("1", "1", Direction.RIGHT, 1);
    State s0 = new State(0, new StateTransition[]{st01});

    StateTransition st11 = new StateTransition(Tape.BLANK, "*", Direction.LEFT, 2);
    State s1 = new State(1, new StateTransition[]{st11});

    StateTransition st21 = new StateTransition(Tape.BLANK, Tape.BLANK, Direction.RIGHT, 3);
    StateTransition st22 = new StateTransition("*", "*", Direction.LEFT, 2);
    StateTransition st23 = new StateTransition("1", "1", Direction.LEFT, 2);
    StateTransition st24 = new StateTransition("X", "X", Direction.LEFT, 2);
    StateTransition st25 = new StateTransition("A", "A", Direction.LEFT, 2);
    State s2 = new State (2, new StateTransition[]{st21, st22, st23, st24, st25});

    StateTransition st31 = new StateTransition("1", Tape.BLANK,  Direction.RIGHT,4);
    StateTransition st32 = new StateTransition("X", Tape.BLANK, Direction.RIGHT, 9);
    State s3 = new State (3, new StateTransition[]{st31, st32});

    StateTransition st41 = new StateTransition("1", "1", Direction.RIGHT,4);
    StateTransition st42 = new StateTransition("X", "X", Direction.RIGHT,5);
    //StateTransition st43 = new StateTransition("*", "*", Direction.RIGHT, 5);
    State s4 = new State (4, new StateTransition[]{st41, st42});

    StateTransition st51 = new StateTransition("*", "*",  Direction.LEFT, 8);
    StateTransition st52 = new StateTransition("1", "A", Direction.RIGHT, 6);
    StateTransition st53 = new StateTransition("A", "A", Direction.RIGHT, 5);
    State s5 = new State (5, new StateTransition[]{st51, st52, st53});

    StateTransition st61 = new StateTransition(Tape.BLANK, "1", Direction.LEFT, 7);
    StateTransition st62 = new StateTransition("*", "*", Direction.RIGHT, 6);
    StateTransition st63 = new StateTransition("1", "1", Direction.RIGHT, 6);
    State s6 = new State (6, new StateTransition[]{st61, st62, st63});

    StateTransition st71 = new StateTransition("*", "*", Direction.LEFT, 7);
    StateTransition st72 = new StateTransition("1", "1", Direction.LEFT, 7);
    StateTransition st73 = new StateTransition("X", "X", Direction.RIGHT, 5);
    StateTransition st74 = new StateTransition("A", "A", Direction.LEFT, 7);
    State s7 = new State (7, new StateTransition[]{st71, st72, st73, st74});

    StateTransition st81 = new StateTransition(Tape.BLANK, Tape.BLANK, Direction.RIGHT, 3);
    StateTransition st82 = new StateTransition("1", "1", Direction.LEFT, 8);
    StateTransition st83 = new StateTransition("X", "X", Direction.LEFT, 8);
    StateTransition st84 = new StateTransition("A", "1", Direction.LEFT, 8);
    State s8 = new State (8, new StateTransition[]{st81, st82, st83, st84});

    StateTransition st91 = new StateTransition("*", Tape.BLANK, Direction.STAY, 10);
    StateTransition st92 = new StateTransition("1", Tape.BLANK, Direction.RIGHT, 9);
    State s9 = new State (9, new StateTransition[]{st91, st92});

    StateTransition st101 = new StateTransition(Tape.BLANK, Tape.BLANK, Direction.STAY, -1);
    StateTransition st102 = new StateTransition("1", Tape.BLANK, Direction.LEFT,10);
    StateTransition st103 = new StateTransition("X", Tape.BLANK,  Direction.LEFT, 10);
    StateTransition st104 = new StateTransition("A", Tape.BLANK, Direction.LEFT,10);
    State s10 = new State(10, new StateTransition[]{st101, st102, st103, st104});

    TuringMachine tm = new TuringMachine(newTape, new State[]{s0, s1, s2, s3, s4, s5, s6,s7, s8, s9, s10}, 0);

    tm.startMachine();





  }

}
