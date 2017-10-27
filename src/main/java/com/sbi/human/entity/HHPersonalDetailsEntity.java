package com.sbi.human.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="HHPersonalDetails")
public class HHPersonalDetailsEntity {
@Id
@GeneratedValue
private Integer id;
@ManyToOne
@JoinColumn(name="tid")
private TitleEntity titleEntity;
private String firstName;
private String middleName;
private String lastName;
private Date dateOfBirth;
private Date dateOfJoining;
@ManyToOne
@JoinColumn(name="gid")
private GenderEntity genderEntity;
@ManyToOne
@JoinColumn(name="hhsid")
private HHStatusEntity hhStatusEntity;
@ManyToOne
@JoinColumn(name="nid")
private NationalityEntity nationalEntity;
private String spouseName;
/*@OneToOne(mappedBy="personalEntity",cascade=CascadeType.ALL)
private HHPassportDetailsEntity passportEntity;


public HHPassportDetailsEntity getPassportEntity() {
	return passportEntity;
}
public void setPassportEntity(HHPassportDetailsEntity passportEntity) {
	this.passportEntity = passportEntity;
}*/
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public TitleEntity getTitleEntity() {
	return titleEntity;
}
public void setTitleEntity(TitleEntity titleEntity) {
	this.titleEntity = titleEntity;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Date getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public GenderEntity getGenderEntity() {
	return genderEntity;
}
public void setGenderEntity(GenderEntity genderEntity) {
	this.genderEntity = genderEntity;
}
public HHStatusEntity getHhStatusEntity() {
	return hhStatusEntity;
}
public void setHhStatusEntity(HHStatusEntity hhStatusEntity) {
	this.hhStatusEntity = hhStatusEntity;
}
public NationalityEntity getNationalEntity() {
	return nationalEntity;
}
public void setNationalEntity(NationalityEntity nationalEntity) {
	this.nationalEntity = nationalEntity;
}
public String getSpouseName() {
	return spouseName;
}
public void setSpouseName(String spouseName) {
	this.spouseName = spouseName;
}


}
