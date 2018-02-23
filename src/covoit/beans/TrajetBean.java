package covoit.beans;

import java.util.Set;
import java.util.Date;

public class TrajetBean {
	
	private LocationBean departure;
	private LocationBean arrival;
	private UserBean driver;
	private Set<UserBean> passengers;
	private Date dep_date;
	private Date arr_date;
	
	/**
	 * 
	 * @param departure
	 * @param arrival
	 * @param driver
	 * @param passengers
	 * @param dep_date
	 * @param arr_date
	 */
	public TrajetBean(LocationBean departure, LocationBean arrival, UserBean driver, Set<UserBean> passengers,
			Date dep_date, Date arr_date) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.driver = driver;
		this.passengers = passengers;
		this.dep_date = dep_date;
		this.arr_date = arr_date;
	}

	public LocationBean getDeparture() {
		return departure;
	}

	public void setDeparture(LocationBean departure) {
		this.departure = departure;
	}

	public LocationBean getArrival() {
		return arrival;
	}

	public void setArrival(LocationBean arrival) {
		this.arrival = arrival;
	}

	public UserBean getDriver() {
		return driver;
	}

	public void setDriver(UserBean driver) {
		this.driver = driver;
	}

	public Set<UserBean> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<UserBean> passengers) {
		this.passengers = passengers;
	}

	public Date getdep_date() {
		return dep_date;
	}

	public void setdep_date(Date dep_date) {
		this.dep_date = dep_date;
	}

	public Date getarr_date() {
		return arr_date;
	}

	public void setarr_date(Date arr_date) {
		this.arr_date = arr_date;
	}
	
	public void proposeTrajet() {
		//call to data layer.
	}
	
	public Set<UserBean> retrievePassengers() {
		return this.getPassengers();
	}
	
}