import java.util.Arrays;
import java.util.Objects;

public class Tape {

  private String[] tape;
  private int head;
  public static String BLANK = "B";

  public Tape(int size) {
    tape = new String[size];
    head = size / 2;
    fillBlank();
  }

  public Tape(int size, String[] startSymbols) {
    this(size);
    setInitialState(startSymbols);
  }

  public Tape (int size, String[] startSymbols, boolean startAtEnd) {
    this(size, startSymbols);
    if (startAtEnd) {
      head += startSymbols.length - 1;
    }
  }

  private void fillBlank() {
    Arrays.fill(tape, BLANK);
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
