public class Tape {

  private String[] tape;
  private int head;

  public Tape(String[] initialState) {
    tape = new String[Integer.MAX_VALUE];
    head = Integer.MAX_VALUE/2;
  }

  public String readTape() {
    return tape[head];
  }

  public void writeTape(String symbol){
    tape[head] = symbol;
  }

  public void moveHead(Direction direction){
    head += direction.directionNo;
  }

}
