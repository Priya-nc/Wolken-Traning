class Address{
 
 private byte houseNo;
 private String area;
 private String city;
 private String state;
 private long pincode;
 
 	void setHouseNo(byte houseNo){
		this.houseNo=houseNo;
	}
	void setArea(String area){
		this.area=area;
	}
	void setCity(String city){
		this.city=city;
	}
	void setState(String state){
		this.state=state;
	}
	void setPincode(long pincode){
		this.pincode=pincode;
	}
	
	
	byte getHouseNo(){
		return houseNo;
	}
	String getArea(){
		return area;
	}
	String getCity(){
	    return city;
		}
	String getState(){
	    return state;
		}
	Long getPincode(){
	    return pincode;
		}
		
}
		