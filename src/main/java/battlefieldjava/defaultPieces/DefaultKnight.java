package battlefieldjava.defaultPieces;

import battlefieldjava.engine.Direction;
import battlefieldjava.engine.World;
import battlefieldjava.occupants.Piece;
import battlefieldjava.ruler.IKnight;
import battlefieldjava.ruler.ILocation;
import battlefieldjava.ruler.IPiece;
import battlefieldjava.ruler.IWorld;


public class DefaultKnight implements IKnight
{
	private int id;
	
	private IWorld world;
	
	protected DefaultKnight(IWorld world)
	{
		this.world = world;
	}
	
	public Direction getDirectionTo(int x, int y)
	{
		return Direction.getDirectionTo(getX(), getY(), x, y);
	}

	public Direction getDirectionTo(ILocation iLocation)
	{
		Direction result = null;
		if (iLocation != null)
			result = Direction.getDirectionTo(getX(), getY(), iLocation.getX(), iLocation.getY());
		return result;
	}
	
	
	public Direction getDirectionTo(IPiece ipiece)
	{
		return getDirectionTo(ipiece.getLocation());
	}

	public int getDistanceTo(int x, int y)
	{
		return world.getLocation(this).getDistanceTo(x,y);
	}

	public int getDistanceTo(ILocation pnt)
	{
		return world.getLocation(this).getDistanceTo(pnt.getX(), pnt.getY());
	}

	public int getDistanceTo(IPiece piece)
	{
		return world.getLocation(this).getDistanceTo(piece);
	}

	public int getId()
	{
		return id;
	}

	public boolean isAlive()
	{
		// If the piece is dead it won't have a location.
		return this.getLocation() != null && ((Piece)World.getOccupantAt(this.getLocation())).isAlive();
	}

	public int getStrength()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void move(Direction direction)
	{
		world.move(this, direction);
	}

	public int getX()
	{
		return getLocation().getX();
	}

	public int getY()
	{
		return getLocation().getY();
	}


	public ILocation getLocation()
	{
		return world.getLocation(this);
	}

//	public void attack(int direction)
//	{
//		// TODO Auto-generated method stub
//		
//	}

	public void setId(int id)
	{
		this.id = id;
	}

	public boolean hasMoved()
	{
		return world.hasMoved(this);
	}

	
}
