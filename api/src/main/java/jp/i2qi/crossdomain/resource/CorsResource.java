package jp.i2qi.crossdomain.resource;

import jp.i2qi.crossdomain.Request;
import jp.i2qi.crossdomain.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by E024040 on 2017/05/10.
 */
@Path("/corsresource")
public class CorsResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(Request request){

        Response resp = new Response();
        resp.valueOne = request.paramOne;
        resp.valueTwo = request.paramTwo;
        resp.valueThree = request.paramThree;

        return resp;
    }
}
