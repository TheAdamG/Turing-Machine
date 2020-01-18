import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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

  public static StateTransition[] parseStateTransitions(String fileIn) {

    List<StateTransition> stateTransitions = new ArrayList<>();
    try (
        BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] lineSplit = line.split(",");
        StateTransition st =
            new StateTransition(Integer.parseInt(lineSplit[0]), lineSplit[1],
                lineSplit[2], Direction.valueOf(lineSplit[3].toUpperCase()),
                Integer.parseInt(lineSplit[4]));
        stateTransitions.add(st);
      }
    } catch (Exception e) {
      throw new IllegalArgumentException(e.toString());
    }

    return stateTransitions.toArray(new StateTransition[0]);
  }


}
