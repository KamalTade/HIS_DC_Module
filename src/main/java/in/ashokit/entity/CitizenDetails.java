package in.ashokit.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Citizen_DC_Module")
public class CitizenDetails {

	@Id
	@GeneratedValue
	@Column(name="CASE_NUMBER")
    private Integer caseNumber;
	
	@Column(name="MONTHLY_SALARY_INCOME")
	private Long monthlySalIncome;
	
	@Column(name="PROPERTY_INCOME")
	private Long propertyIncome;
	
	@Column(name="RENTINCOME")
	private Long rentIncome;
	
	@Column(name="HIGHEST_DEGREE")
    private String highestDegree;
	
	@Column(name="UNIVERSITYNAME")
	private String universityName;
	
	@Column(name="KID_NAME")
    private String kidname;
	
	@Column(name="KID_AGE")
	private Integer kidAge;
	
	@Column(name="KIDSSN")
	private Integer kidSSN;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
}
