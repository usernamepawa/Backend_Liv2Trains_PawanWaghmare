package com.liv2train.trainingcenter.dto;
import java.util.List;
public class TrainingCenterDto {
	
	    private String centerName;
	    private String centerCode;
	    private AddressDto address;
	    private Integer studentCapacity;
	    private List<String> coursesOffered;
	    private String contactEmail;
	    private String contactPhone;
		public String getCenterName() {
			return centerName;
		}
		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}
		public String getCenterCode() {
			return centerCode;
		}
		public void setCenterCode(String centerCode) {
			this.centerCode = centerCode;
		}
		public AddressDto getAddress() {
			return address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
		}
		public Integer getStudentCapacity() {
			return studentCapacity;
		}
		public void setStudentCapacity(Integer studentCapacity) {
			this.studentCapacity = studentCapacity;
		}
		public List<String> getCoursesOffered() {
			return coursesOffered;
		}
		public void setCoursesOffered(List<String> coursesOffered) {
			this.coursesOffered = coursesOffered;
		}
		public String getContactEmail() {
			return contactEmail;
		}
		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}
		public String getContactPhone() {
			return contactPhone;
		}
		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}
		@Override
		public String toString() {
			return "TrainingCenterDto [centerName=" + centerName + ", centerCode=" + centerCode + ", address=" + address
					+ ", studentCapacity=" + studentCapacity + ", coursesOffered=" + coursesOffered + ", contactEmail="
					+ contactEmail + ", contactPhone=" + contactPhone + "]";
		}
		
		
		
		

	    
	  
	}

	class AddressDto {
	    private String detailedAddress;
	    private String city;
	    private String state;
	    private String pincode;
		public String getDetailedAddress() {
			return detailedAddress;
		}
		public void setDetailedAddress(String detailedAddress) {
			this.detailedAddress = detailedAddress;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "AddressDto [detailedAddress=" + detailedAddress + ", city=" + city + ", state=" + state
					+ ", pincode=" + pincode + "]";
		}

	    
	}


