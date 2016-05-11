package mum.edu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Director extends Person{
	
	//private String directorName;
	@Id @GeneratedValue
	private int directorId;
	
	@ManyToMany(mappedBy="director",cascade=CascadeType.PERSIST)
	private List<Movie> movie = new ArrayList<Movie>();
	
	
	public int getDirectorId() {
		return directorId;
	}


	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}


	public Director(String name){
		super(name);	}


	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

}
