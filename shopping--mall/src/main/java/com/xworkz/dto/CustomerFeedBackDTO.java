package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="feedback_details")
public class CustomerFeedBackDTO implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedback_id;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "Purpose")
	private String purpose;
	@NotEmpty
	@NotNull
	@Column(name = "Ambience")
	private String ambience;
	@Column(name = "Visited_Food_Court")
	@NotEmpty
	@NotNull
	private String visitedFoodCourt;
	@NotEmpty
	@NotNull
	@Column(name = "Visited_Rest_Rooms")
	private String visitedRestRooms;
	@NotEmpty
	@NotNull
	@Column(name = "Parking_Experience")
	private String parkingExperience;
	@Column(name = "Total_Experience")
	private String totalExperience;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50)
	@Column(name = "Feed_Back")
	private String feedBack;
	
	
	public CustomerFeedBackDTO(@NotEmpty @NotNull @Size(min = 3, max = 50) String purpose,
			@NotEmpty @NotNull String ambience, @NotEmpty @NotNull String visitedFoodCourt,
			@NotEmpty @NotNull String visitedRestRooms, @NotEmpty @NotNull String parkingExperience,
			String totalExperience, @NotEmpty @NotNull @Size(min = 3, max = 50) String feedBack) {
		super();
		this.purpose = purpose;
		this.ambience = ambience;
		this.visitedFoodCourt = visitedFoodCourt;
		this.visitedRestRooms = visitedRestRooms;
		this.parkingExperience = parkingExperience;
		this.totalExperience = totalExperience;
		this.feedBack = feedBack;
	}
	
	
	
	
	
}
