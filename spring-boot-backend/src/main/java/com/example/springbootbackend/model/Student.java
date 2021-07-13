package com.example.springbootbackend.model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Reg_id")
    private String regId;

    @NotBlank(message = "Invalid institution id")
    @NotEmpty(message = "Institution id can't be empty")
    @Column(name = "institution_id")
    private String institutionId;

    @Column(name = "student_id")
    private String studentId;

    @NotEmpty(message = "first name can't be empty")
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "reg_date")
    private String regDate;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "age")
    private String age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "NID")
    private String nid;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "contact_no ")
    private String contactNo;

    @Column(name = "email_id ")
    private String emailId;

    @Column(name = "photo ")
    private String photo;

    @Column(name = "created_on ")
    private String createdOn;

    @Column(name = "created_by ")
    private String createdBy;

    @Column(name = "academic_qualifications ")
    private String academicQualifications;

    public Student() {
    }

    public Student(long id, String regId, String institutionId, String studentId, String firstName, String lastName, String regDate, String dateOfBirth, String age, String gender, String nid, String occupation, String street, String city, String country, String zipCode, String contactNo, String emailId, String photo, String createdOn, String createdBy, String academicQualifications) {
        this.id = id;
        this.regId = regId;
        this.institutionId = institutionId;
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.regDate = regDate;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.nid = nid;
        this.occupation = occupation;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.photo = photo;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.academicQualifications = academicQualifications;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public void setAcademicQualifications(String academicQualifications) {
        this.academicQualifications = academicQualifications;
    }
}
