public class StateTransition {

  private int state;
  private String symbolRead;
  private String writeInstruction;
  private Direction direction;
  private int nextState;


  public StateTransition(int state, String symbolRead,
      String writeInstruction, Direction direction, int nextState) {
    this.state = state;
    this.symbolRead = symbolRead;
    this.writeInstruction = writeInstruction;
    this.direction = direction;
    this.nextState = nextState;
  }

  public int getState() {
    return state;
  }

  public String getSymbolRead() {
    return symbolRead;
  }

  public String getWriteInstruction() {
    return writeInstruction;
  }

  public Direction getDirection() {
    return direction;
  }

  public int getNextState() {
    return nextState;
  }
}
