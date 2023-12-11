package gt.com.bc.web;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author cjbojorquez
 */
@Provider
public class CorsFilter implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext crc, ContainerResponseContext responseContext) throws IOException {
        MultivaluedMap<String,Object> headers = responseContext.getHeaders();
        headers.add("Access-Control-Allow-Origin","*");
        headers.add("Access-control-Allow-Credentials", "true");
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");
        headers.add("Access-Control-Methods","GET, POST, PUT, OPTIONS, HEAD, DELETE");
        
        
    }
    
}
