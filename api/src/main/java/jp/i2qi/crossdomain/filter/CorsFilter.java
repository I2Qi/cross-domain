package jp.i2qi.crossdomain.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by E024040 on 2017/05/10.
 */
@Provider
public class CorsFilter implements ContainerResponseFilter{
    @Override public void filter(ContainerRequestContext requestContext,
        ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().putSingle("Access-Control-Allow-Methods", "POST");
        responseContext.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type");
    }
}
