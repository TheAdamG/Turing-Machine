import java.util.Objects;

public class Tape {

  private String[] tape;
  private int head;
  private static int TAPE_SIZE = 50;
  public static String BLANK = "B";

  public Tape() {
    tape = new String[TAPE_SIZE];
    head = TAPE_SIZE / 2;
    fillBlank();
  }

  public Tape(String[] startSymbols) {
    this();
    setInitialState(startSymbols);
  }

  public Tape (String[] startSymbols, boolean startAtEnd) {
    this(startSymbols);
    if (startAtEnd) {
      head += startSymbols.length - 1;
    }
  }

  private void fillBlank() {
    for (int i = 0; i < TAPE_SIZE ; i++) {
      tape[i] = BLANK;
    }
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
