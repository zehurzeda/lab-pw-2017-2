<html>
<head>
	<title>Calculo Maior/Menor</title>
</head>
<body>
<h2>Calculo Maior/Menor</h2>
<form>
	Idade <input type="number" name="idade">
	<button>Calcular</button>
</form>
<%
//Inicio do Scriptlet.
String idadeString = request.getParameter("idade");

int idade = idadeString == null ? 0 : Integer.parseInt(idadeString);

if (idade != 0) {
	if (idade < 18) {
%>
  <h3>De menor! Mano.</h3>
<%		
	} else {
%>
  <h3>De maior! Mano.</h3>
<%				
	}
}
%>
</body>
</html>
