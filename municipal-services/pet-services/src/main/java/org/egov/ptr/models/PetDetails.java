package org.egov.ptr.models;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "Details of the pet for pet registration")
@Validated

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PetDetails {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("petDetailsId")
	private String petDetailsId = null;

	@JsonProperty("petName")
	private String petName = null;

	@JsonProperty("petType")
	private String petType = null;

	@JsonProperty("breedType")
	private String breedType = null;

	@JsonProperty("petAge")
	private String petAge = null;

	@JsonProperty("petGender")
	private String petGender = null;

	@JsonProperty("clinicName")
	private String clinicName = null;

	@JsonProperty("doctorName")
	private String doctorName = null;

	@JsonProperty("lastVaccineDate")
	private String lastVaccineDate = null;

	@JsonProperty("vaccinationNumber")
	private String vaccinationNumber = null;

	@JsonProperty("petColor")
	private String petColor = null;

	@JsonProperty("adoptionDate")
	private Long adoptionDate = null;

	@JsonProperty("birthDate")
	private Long birthDate = null;
	
	@JsonProperty("identificationMark")
	private String identificationMark = null;
}
