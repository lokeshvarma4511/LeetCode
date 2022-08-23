package arrays;

public class RefuelingCar {
    public static void main(String[] args)
    {
        int startFuel=1;
        int target=100;
        //array contains 2 stations
        int[][] stations={{10,100}};
        System.out.println(minRefuelStops(target,startFuel,stations));
    }
    static int minRefuelStops(int target, int startFuel, int[][] stations)
    {
        int count=0;
        //eventually we are covering target distance. so, untill the distance become 0 we are searching
        while(target>0)
        {
            //checks if the target distance is less than the fuel in car then no need to stop at station
            if(startFuel>=target)
            {
                return count;
            }
            // if the target distance is more than fuel in car then it will seeks for a nearer station
            else if (startFuel<=target)
            {
                // loop for stations
                for(int i=0;i<stations.length;i++)
                {
                    // checks whether the distance for the station is less than fuel available in car or not
                    if (stations[i][0] <= startFuel)
                    {
                        // if true, updates the startfuel , target and tank of the station
                        startFuel=startFuel-stations[i][0]+stations[i][1];
                        stations[i][0]=0;
                        target=target-stations[i][0];
                        return count+=1;
                    }
                }
            }
            else{
                return -1;
            }
            target=-1;
        }
        return -1;
    }
}