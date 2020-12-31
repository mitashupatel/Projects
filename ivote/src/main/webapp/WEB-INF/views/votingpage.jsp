<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</head>
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
	margin-top: 1.5em;
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
  width:350px;
  padding-bottom: 100px;
}
.table2
{
  margin-top: 10px;
  
  margin-bottom:25px;
  margin-right: 35px;
  border: 1px solid black;
}
th {
	text-align: Center;
	background-color: #f1f1c1;
	  border: 1px solid black;
	  padding: 10px;
}
td {
	border: 1px solid black;
	padding: 10px;
	text-align: Center;
}
.td1
{
text-align:left;
border: none;

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
	height:20px;
	width:180px;
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
<% if(session.getAttribute("user") == null){ %>
	<% response.sendRedirect("/ivote/user/userLoginPage"); %>
<%} %>
		<table cellpadding="3" class="style1" align="center" >
			<tr>
				<td colspan="3" class="style2 td1">
					<div class="container"></div>
				</td>
			</tr>

			<tr>
				<td colspan="3" class = "td1"><marquee direction="left">
						<span> Wel-Come To Online Voting System! </span>
					</marquee></td>
			</tr>

			<tr>
				<td colspan="3" class = "td1">

					<div class="div1">
						<div class="div2">
							<a href="https://www.w3schools.com/html/">Home</a> <a
								href="/ivote/admin/voterRegistrationPage">Register To Vote</a>
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
				<td rowspan = "2" class="sidemenu td1">
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
					<td rowspan="2" class = "td1">
					<div style="color: green;" id="voteRes"></div>
					<table align="center" class= "table2">
			<tr>
				<th>Candidate Detail</th>
				<th>Political Party</th>
				<th>Area</th>
				<th>Leader</th>
				<th>Vote</th>
			</tr>
			<c:forEach var="mp" items="${mpList}">
                     	
			<tr>
				<td><img width="80" height="80" src="/ivote/resources/images/${mp.mpImage}" alt="people"/>
				<br>
				<a href="https://en.wikipedia.org/wiki/${mp.mpFirstName}_${mp.mpLastName}" target="_blank">${mp.mpFirstName} &nbsp; ${mp.mpLastName}</a>
				</td>
				<td>${mp.partyName}</td>
				<td>Leicester East</td>
				<td>${mp.leaderFirstName} &nbsp; ${mp.leaderLastName}</td>
				<td><input onclick="javascript:MyFunction(${mp.mpId},${mp.voterId},${mp.electionId},${mp.partyId} )" type = "button" value = "Vote"></td>
			</tr>
			</c:forEach>
			</table>
					</td>
					</tr>
		</table>
	</div>
	<script type="text/javascript">
  	$("#nationId").change(function() {
  		var nationId = $(this).val();
  		
  		//alert("nationid : "+nationId);
  	    $.ajax({
  	        type: 'GET',
  	        url: "/ivote/user/voting/" + nationId,
  	        success: function(data){
  	            var slctSubcat=$('#regionsByNation'), option="";
  	            slctSubcat.empty();

  	            for(var i=0; i<data.length; i++){
  	                option = option + "<option value='"+data[i].regionId + "'>"+data[i].regionName + "</option>";
  	            }
  	            slctSubcat.append(option);
  	        },
  	        error:function(){
  	            alert("error");
  	        }
  	    });
	});
  	
  	 MyFunction = function(mpId, voterId, electionId, partyId){
       var param = mpId+"/"+voterId+"/"+electionId+"/"+partyId;
 		
 	    $.ajax({
 	        type: 'GET',
 	        url: "/ivote/user/voting/" + param,
 	        success: function(data){
 	        	$("#voteRes").text("Successfully Voted");
 	        	$("input[type=button]").attr("disabled", "disabled");
 	        },
 	        error:function(){
 	            alert("error");
 	        }
 	    });
     }
</script>
</body>
</html>