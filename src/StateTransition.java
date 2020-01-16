public class StateTransition {

  String writeInstruction;
  Direction direction;
  int nextState;

  public StateTransition(String writeInstruction, Direction direction,
      int nextState) {
    this.writeInstruction = writeInstruction;
    this.direction = direction;
    this.nextState = nextState;

  }

}
