package airport.models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "vol")
public class Vol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int horaire;

	private String depart;
	private String destination;
	private String typeVol;

	
	@ManyToOne
	@JoinColumn(name = "id_pilote")
	private Pilot pilot;
	


	public Vol(long id_vol, int horaire, String depart, String destination, String typeVol, Long pilotid) {
		super();
		this.id = id_vol;
		this.horaire = horaire;
		this.depart = depart;
		this.destination = destination;
		this.typeVol = typeVol;
		this.pilot = new Pilot(pilotid, "", "", 0);
	}


	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id_vol) {
		this.id = id_vol;
	}


	public int getHoraire() {
		return horaire;
	}


	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getTypeVol() {
		return typeVol;
	}


	public void setTypeVol(String typeVol) {
		this.typeVol = typeVol;
	}


	public Pilot getPilot() {
		return pilot;
	}


	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}





	
	
	

}
