import java.util.Objects;

public class Tape {

  private String[] tape;
  private int head;
  private static int TAPE_SIZE = 500;

  public Tape(String[] startSymbols) {
    tape = new String[TAPE_SIZE];
    head = TAPE_SIZE / 2;
    setInitialState(startSymbols);
  }

  private void setInitialState(String[] startSymbols) {
    if (Objects.nonNull(startSymbols)) {
      System.arraycopy(startSymbols, 0, tape, head, startSymbols.length);
    }
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
        topRow.append("---");
        middleRow.append("|").append(tape[i]).append("|");
        if (i == head) {
          bottomRow.append("^^^");
        } else {
          bottomRow.append("---");
        }

      }
    }

    return topRow + "\n" + middleRow + "\n"
        + bottomRow;
  }

}
