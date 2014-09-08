package org.test;

public class Studen {
	private String name;
	private String cal;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cal
	 */
	public String getCal() {
		return cal;
	}
	/**
	 * @param cal the cal to set
	 */
	public void setCal(String cal) {
		this.cal = cal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Studen [name=" + name + ", cal=" + cal + "]";
	}
	
}
