import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       SolarSystem planet =SolarSystem.Mercury;
       System.out.println(planet.getSequenceNumber());
       System.out.println(planet.getDistancePlanet());
       System.out.println(planet.getDistanceSun());
       System.out.println(planet.getRadius());
       System.out.println(planet.PreviousPlanet());
       System.out.println(planet.NextPlanet());
    }

    public enum SolarSystem {
        Sun(0,0,696340),
        Mercury(1,50,2440),
        Venus(2,50,6051),
        Earth(3,50,6371),
        Mars(4,50,3389),
        Jupiter(5,600,69911),
        Saturn(6,600,58232),
        Uranus(7,1450,26362),
        Neptune(8,1650,24622);
        private final int SequenceNumber;
        private final int distancePlanet;
        private final int Radius;
        SolarSystem(int SequenceNumber,int distance_planet,int Radius){
            this.SequenceNumber=SequenceNumber;
            this.distancePlanet=distance_planet;
            this.Radius=Radius;
        }
        public Integer getSequenceNumber(){
            return SequenceNumber;
        }
        public Integer getDistancePlanet(){
            return distancePlanet;
        }
        public Integer getRadius(){
            return Radius;
        }
        public Integer getDistanceSun(){
            int distance=0;
            for(int i=1;i<=SequenceNumber;i++){
                distance+=SolarSystem.values()[i].getDistancePlanet();
                if (i!=SequenceNumber){
                distance+=SolarSystem.values()[i].getRadius()*2;
                }
            }
            return distance;
        }
        public SolarSystem  PreviousPlanet(){
            if (SequenceNumber>0){
                return SolarSystem.values()[SequenceNumber-1];
            }
            else
            return null;
        }
        public SolarSystem  NextPlanet(){
            if (SequenceNumber<SolarSystem.values().length-1){
                return SolarSystem.values()[SequenceNumber+1];
            }
            else
                return null;
        }
    }

}