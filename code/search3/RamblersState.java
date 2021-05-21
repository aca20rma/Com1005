import java.util.*;


public class RamblersState extends SearchState {
    // coordinate for thr state
    private String coord;


    public RamblersState(int coord1, int[][] tmap) {
    }



//constructors
puplic RamblersSearch(String cname, int lc) {
        coord = cname;
        localCost = lc;
}



public String getCoord() {
    // accessor
    return coord;
}


public boolean goalPredicate(Search searcher) {
      // goalPredicate
    RamblersSearch rsearcher = (RamblersSearch) searcher;
    String tar = rsearcher.getGoal(); // get target coordinate
    return (coord.compareTo(tar) == 0);
}



public ArrayList<SearchState> getSuccessors(Search searcher) {
      // getSuccessors
    RamblersSearch rsearcher = (RamblersSearch) searcher;
    Coords map = rsearcher.getMap();
    ArrayList<TerrainMap> links = map.getx(coord);
    ArrayList<SearchState> succs = new ArrayList<SearchState>();

    for (TerrainMap l : links) {
      int Coord1;
      if (coord.compareTo(l.getWidth()) == 0) {
        Coord1 = l.getDepth();
      } else {
        Coord1 = l.getWidth();
      }
      ;
      succs.add((SearchState) new RamblersState(Coord1, l.getTmap()));
    }
    return succs;
}


 public boolean sameState(SearchState s2) {
       // sameState
    RamblersState rs2 = (RamblersState) s2;
    return (coord.compareTo(rs2.getCoord()) == 0);
  }

 
  public String toString() {
       // toString
    return ("Ramblers State: " + coord);
  }

}
