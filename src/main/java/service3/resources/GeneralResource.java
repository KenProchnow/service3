package service3.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class GeneralResource {

    @Path("/1")
    @GET
    public String hello() {
        return "hello from service 3 hello/1";
    }

    @Path("/2")
    @GET
    public String hello2() {
        return "hello from service 3 hello/2";
    }



//    @GET
//    public String a1() {
//
//        return "hello from service 3333333";
//    }
//
//    @GET
//    public String a2() {
//        return "hello from service 3";
//    }
//
//    @GET
//    public String a3() {
//        return "hello from service 3";
//    }
//
//    @GET
//    public String a4() {
//        return "hello from service 3";
//    }
//
//    @GET
//    public String a5() {
//        return "hello from service 3";
//    }

}
