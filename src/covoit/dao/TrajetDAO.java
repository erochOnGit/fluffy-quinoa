package covoit.dao;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trajet")
public class TrajetDAO {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private UserDAO driver;
	private LocationDAO departure;
	private LocationDAO arrival;
	private Set<UserDAO> passengers;
	private Date dep_date;
	private Date arr_date;
	
}
