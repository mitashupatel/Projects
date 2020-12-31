package table_per_class_hiber_two;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class Contract_Employee extends Employee {
	
	@Column(name="pay_per_hours")
	private float pay_per_hours;
	@Column(name="contract_duration")
	private String contract_duration;
	
	public float getPay_per_hours() {
		return pay_per_hours;
	}
	public void setPay_per_hours(float pay_per_hours) {
		this.pay_per_hours = pay_per_hours;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
}
