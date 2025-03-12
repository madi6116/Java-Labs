package transport;

public class DamagedRover extends MarsRover{

	public DamagedRover() {

	}
	private final static int   MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY = 10000;
	private final static int   METERS_FROM_START_TO_CLIFF = 1000;
	private final static int N_SIMULATIONS = 500;

	private double  	position;        		// Distance from start. Range is -1000 to +1000. If Rover travels  beyond this range, it falls off a cliff.
	private double  	metersTraveled; 		// Total meters traveled back and forth.
	private boolean 	fell;            		// If true, an expensive loss.
	
	//
	// Simulates travel under damage conditions. In each turn, travels forward or
	// backward either 1, 2, 3, or 4 meters. Continues until there's no more power
	// in the battery, or we fall off a cliff. Cliffs are at position = 1000 or
	// position = -1000.
	//
	public void simulateStormDamageTravel() {
		   
		while (metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY)
		{
	  	// Random int: 1, 2, 3, or 4. Represents the
	  	// travel distance (maybe forward, maybe back) this turn
	      double distanceNextTurn = (int)(1 + 4*Math.random());
	  	// Random boolean for direction of travel this turn.
	      boolean forwardNotBack = (Math.random() > 0.5);
		   	   
	      // Adjust position and metersTraveled.
		if (forwardNotBack){
		    position += distanceNextTurn;}
	      else
		    position -= distanceNextTurn;
	      metersTraveled += distanceNextTurn ;
	      
	      if (position >= 1000);
	      {
		    fell = true;
		    // TERMINATE THE LOOP
		    break;
	      }
		}
	}
		public double getMetersTraveled() {
	   		  return metersTraveled;
	   	   }
	   	   public boolean getFell() {
	   		   return fell;
	   	   }
		    public static void main(String[] args){
	    	  DamagedRover rover1 = new DamagedRover();
	    	  int count = 0;
	    	  for(int i=0; i<N_SIMULATIONS; i++) {
	    	  rover1.simulateStormDamageTravel();
	    	  if(rover1.getFell()) {
	    		  count++;
	    	  } else {
	    		  System.out.println("No Power.");
	    	  }
	    	  System.out.println(count);
	    	  System.out.println("Meter traveled is " + rover1.metersTraveled);
	    	  }
	      }
		   	   }
	    	  
