package com.sbi.human.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="HHPassportDetails")
public class HHPassportDetailsEntity {
@Id
@GeneratedValue
private Integer id;
private Integer passportno;
private Date dateOfIssue;
private Date dateOfExpiry;
@ManyToOne
@JoinColumn(name="iaeid")
private IssueAtEntity issueatEntity;
@OneToOne
@JoinColumn(name="hhpdid")
private HHPersonalDetailsEntity personalEntity;

public HHPersonalDetailsEntity getPersonalEntity() {
	return personalEntity;
}
public void setPersonalEntity(HHPersonalDetailsEntity personalEntity) {
	this.personalEntity = personalEntity;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getPassportno() {
	return passportno;
}
public void setPassportno(Integer passportno) {
	this.passportno = passportno;
}
public Date getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(Date dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}
public Date getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(Date dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
public IssueAtEntity getIssueatEntity() {
	return issueatEntity;
}
public void setIssueatEntity(IssueAtEntity issueatEntity) {
	this.issueatEntity = issueatEntity;
}

}
