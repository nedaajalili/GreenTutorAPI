package it.polito.neda.resource;

import it.polito.neda.bean.UserBean;
import it.polito.neda.dao.UserDao;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class UserResource {


	private UserDao uDao=new UserDao();


	@Path("/{macAddress}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDipendenteByCode(@PathParam("macAddress") String macAddress){
		 return uDao.findUserByMacAddress(macAddress).getKidName();

	}

}
