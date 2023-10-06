package simple;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DesignUndergroundSystem {





    class UndergroundSystem {

        Map<Integer,  String> checkIns;
        Map<String, List<Integer>> timeTravel;
        public UndergroundSystem() {
            checkIns = new HashMap<>();
            timeTravel = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            String checkInStationInfo = stationName+"-"+t;
            checkIns.put(id, checkInStationInfo);
        }

        public void checkOut(int id, String stationName, int t) {
            String checkInStation = checkIns.get(id);
            String startDest = checkInStation.substring(0,checkInStation.indexOf('-'));
            int startTime = Integer.parseInt(checkInStation.substring(checkInStation.indexOf('-')+1));

            String route = getRoute(startDest, stationName);
            int travelTime = t - startTime;
            //checkIns.remove(startDest);

            List<Integer> tripsTime = timeTravel.getOrDefault(route, new ArrayList<>());
            tripsTime.add(travelTime);
            timeTravel.put(route, tripsTime);
        }

        public double getAverageTime(String startStation, String endStation) {
            String route = getRoute(startStation, endStation);

            List<Integer> times = timeTravel.get(route);
            Double totalTravelTime = 0.0;
            int trips = times.size();

            for(Integer i: times){
                totalTravelTime += i;
            }

            Double res = totalTravelTime/trips;
            return res;
        }

        public String getRoute(String startStation, String endStation) {
            return startStation +"-"+endStation;
        }
    }

}
