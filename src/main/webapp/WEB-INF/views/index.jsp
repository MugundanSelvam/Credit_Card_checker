<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<title>CreditCard-Home Page</title>
<style>  
        .error {color:red}  
</style>  
</head>
<body>
<h2>Check for Credit Card Eligibility</h2>

<form:form action="checkEligibility" modelAttribute="panModel" method="POST">
Enter PAN Number:<form:input path="panNo" id="panNo" pattern="[A-Za-z0-9]{10}" title="10 Character Alpanumeric" required="required"/> 
<br/>
<input type="submit" id="submit" value="Check">
</form:form>

</body>
</html>
