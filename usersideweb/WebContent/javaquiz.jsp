<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz JAVA</title>
	<link rel="stylesheet" href="assets/css/quizpage.css">
</head>
<body>
<%@ include file="header.jsp" %>
<h3 class="text-center" >Java Basic Quiz</h3>
	<!-- Container-fluid start -->
	<div class="container-fluid">
		<!-- Start Row -->
		<div class="row justify-content-center">
			<div class="col-sm-12 text-sm-center text-xs-center">
			 This Quiz Contains 15 Questions. You have Four Options for perticular Question.You have to select Right one. Every Question is about 1 marks.
			</div>
		</div>
		<br><hr>
		<!-- End Row -->
		<!-- Row Start -->
		<div class="row justify-content-center">
			
				<!-- Question here -->
				<div class="question">
					  
					  <h3>1) What is Java?</h3>
					  <p>Choose 1 answer</p>
					  <hr />

  					<div id='block-11' style='padding: 10px;'>
    					<label for='option-11' class="answer">
      					<input type='radio' name='option' value='6/24' id='option-11' class="questionoption"/>
     					Programing Language</label>
  					    <span id='result-11'></span>
  					</div>
 					    <hr />

  					<div id='block-12' style='padding: 10px;'>
					    <label for='option-12' class="answer">
					      <input type='radio' name='option' value='6' id='option-12' class="questionoption" />
					      MarkUp Language</label>
					    <span id='result-12'></span>
  					</div>
 						 <hr />

  					<div id='block-13' style='padding: 10px;'>
					    <label for='option-13' class="answer">
					      <input type='radio' name='option' value='1/3' id='option-13'class="questionoption"/>
					      Speaking Language</label>
					    <span id='result-13'></span>
  					</div>
 							 <hr />

  					<div id='block-14' style='padding: 10px;'>
					    <label for='option-14' class="answer">
					      <input type='radio' name='option' value='1/6' id='option-14' class="questionoption" />
					      Ancient Language</label>
					    <span id='result-14'></span>
  					</div>
  						<hr />
  						
  					<button type='button' onclick='displayAnswer1()' class="thm-btn subbutton">Submit</button> &nbsp&nbsp&nbsp&nbsp <button type='button'  class="thm-btn subbutton">Next</button>
			</div>
		
			
		</div>
			<!-- Row End -->
		
	</div>
	<!-- Container-fluid end -->	
		<%@ include file="footer.jsp" %>
		
			<script>
  //    The function evaluates the answer and displays result
  function displayAnswer1() {
    if (document.getElementById('option-11').checked) {
      document.getElementById('block-11').style.border = '3px solid limegreen'
      document.getElementById('result-11').style.color = 'limegreen'
      document.getElementById('result-11').innerHTML = 'Correct!'
    }
    if (document.getElementById('option-12').checked) {
      document.getElementById('block-12').style.border = '3px solid red'
      document.getElementById('result-12').style.color = 'red'
      document.getElementById('result-12').innerHTML = 'Incorrect!'
      showCorrectAnswer1()
    }
    if (document.getElementById('option-13').checked) {
      document.getElementById('block-13').style.border = '3px solid red'
      document.getElementById('result-13').style.color = 'red'
      document.getElementById('result-13').innerHTML = 'Incorrect!'
      showCorrectAnswer1()
    }
    if (document.getElementById('option-14').checked) {
      document.getElementById('block-14').style.border = '3px solid red'
      document.getElementById('result-14').style.color = 'red'
      document.getElementById('result-14').innerHTML = 'Incorrect!'
      showCorrectAnswer1()
    }
  }
  // the functon displays the link to the correct answer
  function showCorrectAnswer1() {
    let showAnswer1 = document.createElement('p')
    showAnswer1.innerHTML = 'Show Corrent Answer'
    showAnswer1.style.position = 'relative'
    showAnswer1.style.top = '-180px'
    showAnswer1.style.fontSize = '1.75rem'
    document.getElementById('showanswer1').appendChild(showAnswer1)
    showAnswer1.addEventListener('click', () => {
      document.getElementById('block-11').style.border = '3px solid limegreen'
      document.getElementById('result-11').style.color = 'limegreen'
      document.getElementById('result-11').innerHTML = 'Correct!'
      document.getElementById('showanswer1').removeChild(showAnswer1)
    })
  }
</script>
		
</body>
</html>