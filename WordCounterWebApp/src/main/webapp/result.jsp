<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Word Count Result</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <div class="container">
        <div class="result-container">
    <h2 >Word Count Result</h2>
    <p>Total number of words: <%= request.getAttribute("totalWords") %></p>
<a href="wordcount.jsp" class="button">Go back to Home Page</a>
</div>
</div>

</body>
 <footer>
       <span>&copy; Shantanu Payal</span>
    </footer>
</html>