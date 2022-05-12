package co.edu.unbosque.restful.resources;
import co.edu.unbosque.restful.model.Artist;
import co.edu.unbosque.restful.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/person")
public class PersonResource {

    private @Context UriInfo uriInfo;

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Person register(@FormParam("name") String name, @FormParam("email") String email, @FormParam("password") String password) {
        System.out.println("Entrooooo");
        Person person = new Artist(name, email, password, "artist", 0, "artist description");
        System.out.println(person);
        return person;
    }

}
