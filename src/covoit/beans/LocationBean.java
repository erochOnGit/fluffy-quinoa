package covoit.beans;

public class LocationBean {
	private String name;
	private double lng;
	private double lat;
	
	
	public LocationBean (String _name, double _long, double _lat) {
		this.name = _name;
		this.lng = _long;
		this.lat = _lat;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getLongitude() {
		return lng;
	}


	public void setLongitude(double longitude) {
		this.lng = longitude;
	}


	public double getLatitude() {
		return lat;
	}


	public void setLatitude(double latitude) {
		this.lat = latitude;
	}
	
	
}
