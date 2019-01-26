package battlefieldjava.occupants;

import battlefieldjava.ruler.IOccupant;

public class ITreeImpl implements IOccupant
{
	int id;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}

}
