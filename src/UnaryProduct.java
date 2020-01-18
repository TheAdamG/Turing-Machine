public class UnaryProduct {

  public static void main(String[] args) {

    Tape newTape = new Tape(60, new String[]{"1", "1", "1", "1", "1", "X", "1",
        "1", "1", "1"});
    StateTransition[] transitions = new StateTransition[]{

        new StateTransition(0, "1", "1", Direction.RIGHT, 1),

        new StateTransition(1, Tape.BLANK, "*", Direction.LEFT, 2),

        new StateTransition(2, Tape.BLANK, Tape.BLANK, Direction.RIGHT, 3),
        new StateTransition(2, "*", "*", Direction.LEFT, 2),
        new StateTransition(2, "1", "1", Direction.LEFT, 2),
        new StateTransition(2, "X", "X", Direction.LEFT, 2),
        new StateTransition(2, "A", "A", Direction.LEFT, 2),

        new StateTransition(3, "1", Tape.BLANK, Direction.RIGHT, 4),
        new StateTransition(3, "X", Tape.BLANK, Direction.RIGHT, 9),

        new StateTransition(4, "1", "1", Direction.RIGHT,4),
        new StateTransition(4, "X", "X", Direction.RIGHT,5),

        new StateTransition(5, "*", "*", Direction.LEFT, 8),
        new StateTransition(5, "1", "A", Direction.RIGHT, 6),
        new StateTransition(5, "A", "A", Direction.RIGHT, 5),

        new StateTransition(6, Tape.BLANK, "1", Direction.LEFT, 7),
        new StateTransition(6, "*", "*", Direction.RIGHT, 6),
        new StateTransition(6, "1", "1", Direction.RIGHT, 6),

        new StateTransition(7, "*", "*", Direction.LEFT, 7),
        new StateTransition(7, "1", "1", Direction.LEFT, 7),
        new StateTransition(7, "X", "X", Direction.RIGHT, 5),
        new StateTransition(7, "A", "A", Direction.LEFT,  7),

        new StateTransition(8, Tape.BLANK, Tape.BLANK, Direction.RIGHT, 3),
        new StateTransition(8, "1", "1", Direction.LEFT,8),
        new StateTransition(8, "X", "X", Direction.LEFT,8),
        new StateTransition(8, "A", "1", Direction.LEFT,8),

        new StateTransition(9, "*", Tape.BLANK, Direction.STAY, 10),
        new StateTransition(9, "1", Tape.BLANK, Direction.RIGHT, 9),

        new StateTransition(10, Tape.BLANK, Tape.BLANK, Direction.STAY, -1),
        new StateTransition(10, "1", Tape.BLANK, Direction.LEFT, 10),
        new StateTransition(10, "X", Tape.BLANK, Direction.LEFT, 10),
        new StateTransition(10, "A", Tape.BLANK, Direction.LEFT, 10)
    };

    TuringMachine tm = new TuringMachine(newTape, transitions, 0);

    tm.startMachine();


  }

}
