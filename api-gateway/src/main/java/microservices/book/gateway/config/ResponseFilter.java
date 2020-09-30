package microservices.book.gateway.config;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.google.common.io.CharStreams;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ResponseFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		System.out.println("Inside Response Filter");
		RequestContext context = RequestContext.getCurrentContext();
		try (final InputStream responseDataStream = context.getResponseDataStream()) {

			String responseData = CharStreams.toString(new InputStreamReader(responseDataStream, "UTF-8"));
			log.info("BODY: {}", responseData);
			context.setResponseBody(responseData);
		} catch (Exception e) {
		}
		return null;
	}

}