import java.util.Objects;

public class Tape {

  private String[] tape;
  private int head;
  private static int TAPE_SIZE = 16;
  public static String BLANK = "B";

  public Tape(String[] startSymbols) {
    tape = new String[TAPE_SIZE];
    head = TAPE_SIZE / 2;
    setInitialState(startSymbols);
  }

  private void setInitialState(String[] startSymbols) {
    for (int i = 0; i < TAPE_SIZE ; i++) {
      tape[i] = BLANK;
    }
    if (Objects.nonNull(startSymbols)) {
      System.arraycopy(startSymbols, 0, tape, head, startSymbols.length);
    }
    //head += startSymbols.length - 1;
  }

  public String readTape() {
    return tape[head];
  }

  public void writeTape(String symbol) {
    tape[head] = symbol;
  }

  public void moveHead(Direction direction) {
    head += direction.directionNo;
  }


  public String toString() {
    StringBuilder topRow = new StringBuilder();
    StringBuilder middleRow = new StringBuilder();
    StringBuilder bottomRow = new StringBuilder();
    for (int i = 0; i < tape.length; i++) {
      if (Objects.nonNull(tape[i])) {
        //if (!tape[i].equals(BLANK)) {
          topRow.append("---");
          middleRow.append("|").append(tape[i]).append("|");
          if (i == head) {
            bottomRow.append("^^^");
          } else {
            bottomRow.append("---");
          }
        // }

      }
    }

    return topRow + "\n" + middleRow + "\n"
        + bottomRow;
  }

}
