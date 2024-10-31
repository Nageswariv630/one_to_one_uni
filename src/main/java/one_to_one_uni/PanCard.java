package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String pNo;
	private int pin;
	public PanCard(){
		
	}
	public PanCard(int id, String pNo, int pin) {
		super();
		this.id = id;
		this.pNo = pNo;
		this.pin = pin;
	}
}
