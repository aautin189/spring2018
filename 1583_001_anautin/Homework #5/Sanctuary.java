


class Sanctuary
{


	// DECLARE: variable to hold String literal (Sanctuary description)
	private String sanctuaryDescription;


	// DECLARE: variables that will store references to other instances of Sanctuary
	private Sanctuary north;
	private Sanctuary east;
	private Sanctuary west;
	private Sanctuary south;







// 								ASSIGNING INITIAL VALUES TO OUR DATA
// --------------------------------------------------------------------------------------- //






	// CONSTRUCTOR:
	// assigns String literal to the sanctuaryDescription variable

	public Sanctuary (String details)
	{

		this.sanctuaryDescription = details;

	
	} // end CONSTRUCTOR: Sanctuary






	public void setExits(Sanctuary north, Sanctuary south, Sanctuary east, Sanctuary west)
	{
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	
	} // end scope: METHOD setExits








// 										OPERATIONS ON DATA
// ______________________________________________________________________________________________ //


	// METHOD
	// returns just one comprehensive String that includes any of the smaller String literals that evaluate to true; see below
	public String getAvailableExitsString()
	{	


		String availableExitsString = "";	

		if (this.north != null)
		{
			availableExitsString += "north, ";
		}

		if (this.south != null)
		{
			availableExitsString += "south, ";
		}

		if (this.east != null)
		{
			availableExitsString += "east, ";
		}

		if (this.west != null)
		{
			availableExitsString += "west ";		
		}
		

		return availableExitsString;

	} // end scope: METHOD getAvailableExitsString







	public String getExitsMessageString()
	{

		String exitsMessageString = "-> Additional sanctuaries to the: ";
		return exitsMessageString;

	
	} // end scope: METHOD getExitsMessageString






// 										HELPER METHODS
// ______________________________________________________________________________________________ //


	public String getDescription()
	{

		return this.sanctuaryDescription;
	
	} // end scope: METHOD getDescription





	// METHODS
	// to return current values stored inside directions variables
	public Sanctuary getNorth()
	{

		return this.north;
	}


	public Sanctuary getSouth()
	{

		return this.south;
	}


	public Sanctuary getEast()
	{

		return this.east;
	}


	public Sanctuary getWest()
	{

		return this.west;
	}






} // end scope: CLASS Sanctuary


