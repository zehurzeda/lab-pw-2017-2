package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/menormaiorjaxrs")
public class IMCRest {

	@GET
	@Path("/calcular")
	@Produces("application/json")
	public IMC calcular(@QueryParam("peso") int peso, @QueryParam("altura") int altura, @QueryParam("sexo") char sexo) {
	  IMC imc = new IMC(peso, altura, sexo);
	  imc.calcular();
	  return imc;
	}
}