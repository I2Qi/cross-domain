package jp.i2qi.crossdomain.resource;

import jp.i2qi.crossdomain.Response;
import org.glassfish.jersey.server.JSONP;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 *
 */
@Path("/jsonpresource")
public class JsonpResource {

    @GET
    @JSONP(queryParam = "callback")
    @Produces({"application/javascript"})
    public Response get(@QueryParam("param")String param){

        Response resp = new Response();
        resp.valueOne = param;
        resp.valueTwo = "two";
        resp.valueThree = "three";

        return resp;
    }

}
