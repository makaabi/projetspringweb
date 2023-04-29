package airport.models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "pilot")	
public class Pilot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private int age;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "pilot",cascade = CascadeType.REMOVE)
	@JsonIgnore
	private  Set<Vol> vols=new HashSet<>();
	
	public Pilot(long id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Pilot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId_pilote(long id_pilote) {
		this.id = id_pilote;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Vol> getVols() {
		return vols;
	}
	public void setVols(Set<Vol> vols) {
		this.vols = vols;
	}
	
	


}
