 function register(){
	   console.log("Calling register function");
	   
	   var regButton = document.getElementById("regButton");
	   
	   regButton.style.backgroundColor='green'
	   regButton.style.color='white'
	   
	   var name = document.getElementById("name");
	   console.log(name.value)
	   
	   var nameMessage=document.getElementById("nameMessage")
	   nameMessage.innerHTML=''
	   if(name.value=='  '){
		   alert("Please Enter Name")
		   nameMessage.innerHTML="Please Enter Name"
		   nameMessage.style.color='red'
		   return false;
	   }else{
	   
	   alert('Welcome to page')
	//   window.location=
	   
	   }

}