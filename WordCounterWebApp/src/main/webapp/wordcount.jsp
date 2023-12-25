<!DOCTYPE html>
<html>
<head>
    <title>Word Count Tool</title>
    
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1 class="navbar">Word Count Tool</h1>
<div class="container">
    
    <form action="WordCounterServlet" method="post">
          <label for="content">Enter Text :</label>
            <input type="text" id="content" name="content" placeholder="Enter or paste  your text here">
            <input type="submit" value="Count Words">
    </form>
    </div>
    
    <%
        // Display result from the Servlet
        Integer totalWords = (Integer) request.getAttribute("totalWords");
        if (totalWords != null) {
            out.println("<p>Total number of words: " + totalWords + "</p>");
        }
    %>
</body>
 <footer>
        <span>&copy; Shantanu Payal</span>
    </footer>
</html>
