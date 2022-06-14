package model;

import java.util.List;

public interface IFacilitadorDAO {
	
	public void crear(Facilitador F);
	public Facilitador read(int id);
	public List<Facilitador> read();
	public void update(Facilitador F);
	public void delete(Facilitador F);
	public void delete(int id);

}
