
import java.util.*;

public class RamblersSearch extends Search {

  private Coords map; // map we're searching
  private String goal; // goal city

  public Coords getMap() {
    return map;
  }

  public String getGoal() {
    return goal;
  }

  public RamblersSearch(Coords m, String g) {
    map = m;
    goal = g;
  }
}
