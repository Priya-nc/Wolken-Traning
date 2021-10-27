var uppercase=/[A-Z]+/
var lowercase=/[a-z]+/
var num=/[0-9]+/
function validateName(){
var name=document.getElementById("name_input").value;
  if((name=="" || name.length<3 || name.length>15 ||uppercase.test(name))){
	  document.getElementById("name").innerHTML="invalid name";
  }
  else{
	  alert("valid");
  }
}
function validateEmail(){
var email=document.getElementById("email_input").value;
  if((email=="" || email.length<6 || email.length>18 )){
	  document.getElementById("email").innerHTML="invalid email";
  }
  else{
	  alert("valid");
  }
}

function validatePassword(){
var passwor=document.getElementById("password_input").value;
  if((passwor=="" || passwor.length<6 || passwor.length>18 )){
	  document.getElementById("password").innerHTML="invalid password";
  }
  else{
	  alert("valid");
  }
}

function validateCnfPassword(){
var cpassword=document.getElementById("confirm_password_input").value;
var passwor=document.getElementById("password_input").value;
  if(cpassword=passwor){
	  document.getElementById("cpassword").innerHTML="password not matching";
  }
  else{
	  alert("valid");
  }
}

function validateContact(){
var contact=document.getElementById("contact_number_input").value;

  if((!(num.test(contact))|| contact=="" ||( contact.length=10))){
	  document.getElementById("contact").innerHTML="Invalid contact";
  }
}
  
function validateDate(){
	
	var date=document.getElementById("dob_input").value;
	if(date==""){
	  document.getElementById("dob").innerHTML="Invalid date of birth";
  }
}

function validateCity(){
	var city=document.getElementById("city_input").value;
	if(city==""){
		 document.getElementById("city").innerHTML="Invalid city Name";
	}
	
}

function validateStatus(){
	var single=document.getElementById("status_single_input").value;
	var married=document.getElementById("status_married_input").value;
	var divorced=document.getElementById("status_divorced_input").value;
	
	if(single==""|| married=="" ||divorced=="" ){
		 document.getElementById("status").innerHTML="Invalid date of birth";
	}
	
}

