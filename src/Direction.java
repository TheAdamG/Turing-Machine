public enum Direction {
  RIGHT (-1),
  LEFT (1),
  STAY (0);

  public final int directionNo;

  private Direction (int directionNo) {
    this.directionNo = directionNo;
  }



}
