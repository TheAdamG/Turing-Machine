public class StateTransition {

  private String symbolRead;
  private String writeInstruction;
  private Direction direction;
  private int nextState;

  public StateTransition(String symbolRead, String writeInstruction,
      Direction direction, int nextState) {
    this.symbolRead = symbolRead;
    this.writeInstruction = writeInstruction;
    this.direction = direction;
    this.nextState = nextState;
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
