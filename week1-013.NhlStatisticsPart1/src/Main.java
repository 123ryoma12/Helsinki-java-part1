import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("Top 10 by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 10 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Stats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Stats for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Something with anaheim");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
