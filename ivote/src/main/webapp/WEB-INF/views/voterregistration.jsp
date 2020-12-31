<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Iconic Fonts -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/flat-icons/flaticon.css">
    <link href="/ivote/resources/vendors/iconic-fonts/font-awesome/css/all.min.css" rel="stylesheet">
  <!-- Bootstrap core CSS -->
  <link href="/ivote/resources/assets/css/bootstrap.min.css" rel="stylesheet">
  <!-- jQuery UI -->
  <link href="/ivote/resources/assets/css/jquery-ui.min.css" rel="stylesheet">
  <!-- Costic styles -->
  <!-- Favicon -->
  <link rel="icon" type="image/png" sizes="32x32" href="/ivote/resources/favicon.ico">
<script src="/ivote/resources/assets/js/jquery-3.3.1.min.js"></script>
<!-- Include plugin file -->
<script src="https://getaddress-cdn.azureedge.net/scripts/jquery.getAddress-3.0.4.min.js"></script>


</head>
<link href="/ivote/resources/assets/css/jquery-ui.min.css" rel="stylesheet">
  
<style type="text/css">
.style1 {
	width: 80%;
	border-style: double;
	border-color: Blue;
}

.design {
	color: White;
	font-size: 20px;
	text-decoration: none;
	border-radius: 20pt;
}

.style2 {
	height: 250px;
	
}

.container {
	width: 100%;
	height: 350px;
	background-image: url("images/bg-01.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-position: 20% 20%;
}

.div1 {
	border: 2px solid #C0E6F3;
	border-radius: 12px;
	background-color: #C0E6F3;
	height: 50px;
	margin-left: 2em;
	margin-right: 2em;
}

.div2 {
	margin-left: 3em;
	margin-right: 3em;
	color: White;
	font-size: 25px;
	margin-top: 10px;
}

a:link, a:visited { //
	background-color: #f44336;
	padding-right: 25px;
	text-align: center;
	text-decoration: none; //
	display: inline-block;
}

.divside1 {
	border: 2px solid #C0E6F3;
	border-radius: 12px;
	background-color: #C0E6F3;
	height: 35px;
	width: 70%;
	margin-left: 2em;
	margin-top: 1.3em;
}

.divside2 {
	color: White;
	font-size: 25px;
	text-align:center;
}

table, th, td, tr {
  font-size: 18px;
}

.th1
{
 font-size:18px;
}

.sidemenu
{
  height:400px;
  width:400px; 
  padding-bottom:130px;
}
.table2
{
  margin-top: 60px;
  margin-left: 110px;
  margin-bottom:50px;
}
input[type=submit]
{
  border: 2px solid #C0E6F3;
	border-radius: 8px;
	background-color: #C0E6F3;
	height:35px;
	width: 130px;
	font-size: 19px;
	text-align:center;
	cursor: pointer;
}

input[type=text],[type=phone],[type=password]
{
	height:22px;
	width:230px;
}
input[type=button]
{
 	border: 2px solid #C0E6F3;
	border-radius: 8px;
	background-color: #C0E6F3;
	height:25px;
	width: 100px;
	font-size: 12px;
	text-align:center;
	cursor: pointer;
}
</style>
<body>
<div>
		<table cellpadding="3" class="style1" align="center" >
			<tr>
				<td colspan="3" class="style2">
					<div class="container"></div>
				</td>
			</tr>

			<tr>
				<td colspan="3"><marquee direction="left">
						<span> Wel-Come To Online Voting System! </span>
					</marquee></td>
			</tr>

			<tr>
				<td colspan="3">

					<div class="div1">
						<div class="div2">
							<a href="https://www.w3schools.com/html/">Home</a> <a
								href="https://www.w3schools.com/html/">Register To Vote</a>
								 <a
								href="login.jsp">Login</a> 
								<a href = "candidate.jsp"> Candidates</a>
								<a
								href="https://www.w3schools.com/html/">Contact Us</a>
								

						</div>

					</div>
				</td>
			</tr>
			<tr>
				<td rowspan = "2" class="sidemenu">
					<div class="divside1">
						<div class="divside2">
							<a href="https://www.w3schools.com/html/">Home</a>
						</div>
					</div>
			
					<div class="divside1">
						<div class="divside2">
							<a href="https://www.w3schools.com/html/">Register To Vote</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="https://www.w3schools.com/html/">Login</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="candidate.jsp">Candidates</a>
						</div>
					</div>
					
					<div class="divside1">
						<div class="divside2">
							<a href="candidate.jsp">Contact Us</a>
						</div>
					</div>
					</td>
					<td rowspan="2">
					<form:form class="needs-validation" action="/ivote/admin/voterRegistration"
							modelAttribute="voter" method="post">
                <form:hidden class="form-control" id="voterId" name="voterId" path="voterId"/>
					<table class="table2" cellpadding = "7" cellspacing = "7" align ="left"> 
					<tr>
					<th colspan= "2">Create an Account </th>
					</tr>
					<tr>
					<td> First Name: </td>
					<td> <form:input class="form-control" type="text" id="firstName" name="firstName" path="firstName" placeholder="first name" /><div id="valFname" style="color: red;"></div></td>
					</tr>
					<td> Last Name: </td>
					<td><form:input class="form-control" type="text" id="lastName" name="lastName" path="lastName" placeholder="last name" /><div id="valLname" style="color: red;"></div> </td>
					</tr>
					<tr>
					<td> NI Number: </td>
					<td><form:input class="form-control" type="text" id="niNumber" name="niNumber" path="niNumber" placeholder="NI number" /><div id="niCheck" style="color: red;"></div></td>
					</tr>
					<tr> 
					<td> Email: 
					</td>
					<td><form:input class="form-control" type="text" id="email" name="email" path="email" placeholder="test@gmail.com" aria-describedby="inputGroupPrepend" /><div id="emailCheck" style="color: red;"></div>
                    </td>
					</tr>
					<tr> 
					<td> Email: 
					</td>
					<td><div id="postcode_lookup"></div>  
                    </td>
					</tr>
					<tr> 
					<td> Postcode
					</td>
					<td><form:input class="form-control" type="text" id="postcode" name="pincode" path="pincode" placeholder="postcode" /><div id="valpostcode" style="color: red;"></div>
                    </td>
					</tr>
					<tr> 
					<td> House No.
					</td>
					<td><form:input class="form-control" type="text" id="houseNo" name="address" path="address" placeholder="house no" /><div id="valHouseNo" style="color: red;"></div>
                    </td>
					</tr>
					<td> Citizenship
					</td>
					<td> <form:select class="custom-select" id="citizen" path="citizen">
                           <form:option value="no citizen">-- Select citizen --</form:option>
                           <form:option value="British">British</form:option>
                           <form:option value="Irish">Irish</form:option>
                  </form:select><div id="valCitizen" style="color: red;"></div>
                  </td>
					</tr>
	
					<tr> 
<td align = "right"> <input type="submit" value="Register" name="otp1" onsubmit="validation()"> </td>
<td class = "th1">Already have an account?<input type = "button" value = "Log-in"> </td>
					</table>
					
					</td>
					</tr>
					
					<tr>
					<td>
					</td>
					</tr>
					<tr>
					<td>
					</td>
					</tr>
		</table></form:form>
	</div>
</body>
<script type="text/javascript">
var eResult = "";
var niResult = "";

$('#postcode_lookup').getAddress(
    {
    api_key: 'Lq1dgQwjE0q62TkZLCmruw25707',  
    output_fields:{
        line_1: '#houseNo',
        line_2: '#line2',
        line_3: '#line3',
        post_town: '#town',
        county: '#county',
        postcode: '#postcode'
    }
});
	
	$( "form" ).submit(function( event ) {
		let i = 0;
		var fname = $("#firstName").val();
		var lname = $("#lastName").val();
		var ni = $("#niNumber").val();
		var email = $("#email").val();
		var postcode = $("#postcode").val();
		var houseNo = $("#houseNo").val();
		var citizen = $("#citizen").val();

		if(fname == "")
		{
			$("#valFname").text("required firstname");
			i++;
		}
		else{
			$("#valFname").text("");
		}
		if(lname == "")
		{
			$("#valLname").text("required lastname");
			i++;
		}
		else{
			$("#valLname").text("");
		}
		if(email == "")
		{
			$("#emailCheck").text("required email");
			i++;
		}
		else if(email !== "")
		{
			checkEmail(email);
			if(eResult != "")
			{
				$("#emailCheck").text("emailId already exist");
				i++;
			}
			else{
				$("#emailCheck").text("");
			}
		}
		
		if(ni == "")
		{
			$("#niCheck").text("required NI number");
			i++;
		}
		else if(ni != "")
		{
			checkNi(ni);
			if(niResult != ""){
			$("#niCheck").text("NI number already exist");
			i++;}
			else{
				$("#niCheck").text("");
			}
		}
		
		if(houseNo == "")
		{
			$("#valHouseNo").text("required House No");
			i++;
		}
		else{
			$("#valHouseNo").text("");
		}
		if(postcode == "")
		{
			$("#valpostcode").text("required postcode");
			i++;
		}
		else{
			$("#valpostcode").text("");
		}
		
		if(i>0)
		{
			return false; 
		}
	});
	
	function checkEmail(email)
	{
		$.ajax({
  	        type: 'GET',
  	      	async: false,
  	    	timeout: 30000,
  	        url: "/ivote/user/checkEmail/" + email,
  	        success: function(data){
  	        	eResult = data;
  	        },
  	        error:function(){
  	            alert("error");
  	        }
  	    });
	}
	function checkNi(ni)
	{
		$.ajax({
  	        type: 'GET',
  	     	async: false,
	    	timeout: 30000,
  	        url: "/ivote/user/checkNiNumber/" + ni,
  	        success: function(data){
  	        	niResult = data;
  	        },
  	        error:function(){
  	            alert("error");
  	        }
  	    });
	}
</script>
<script src="/ivote/resources/assets/js/jquery-3.3.1.min.js"></script>
<script src="/ivote/resources/assets/js/jquery-ui.min.js"> </script>
</html>