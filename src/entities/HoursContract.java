package entities;

import java.util.Date;

public class HoursContract {
	private Date date;
	private double valorPerHour;
	private Integer hours;
	
	
	public HoursContract() {
		
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getValorPerHour() {
		return valorPerHour;
	}
	public void setValorPerHour(double valorPerHour) {
		this.valorPerHour = valorPerHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public HoursContract(Date date, double valorPerHour, Integer hours) {
		this.date = date;
		this.valorPerHour = valorPerHour;
		this.hours = hours;
	}
	
	public double totalValue() {
		return valorPerHour * hours;
	}
	
	
}
