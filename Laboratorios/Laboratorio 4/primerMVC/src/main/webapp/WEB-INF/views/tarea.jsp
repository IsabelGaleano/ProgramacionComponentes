<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Calculo de factorial</title>
</head>
<body>
<P> The time on the server is ${serverTime}. </P>
<p> The number is ${ tarea.numero }</p>
<p> The factorial is ${ tarea.getFactorial }</p>



</body>
</html>
