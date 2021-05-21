import java.util.*;

public class RunRamblerBB {

  public static void main(String[] arg) {

    Coords xCoords = new Coords();
    xCoords.mapFromFile("map1.csv");
    // System.out.println(map1.toString());
    // System.out.println(map1.getLinks("Start"));

    RamblersSearch searcher = new RamblersSearch("Goal");
    SearchState initState = (SearchState) new RamblersState("Start", 0);

    // change from search1 - specify strategy
    // String res_df = searcher.runSearch(initState, "breadthFirst");
    // System.out.println(res_df);
    // String res_bf = searcher.runSearch(initState, "depthFirst");
    // System.out.println(res_bf);

    String res_bb = searcher.runSearch(initState, "branchAndBound");
    System.out.println(res_bb);
  }
}
