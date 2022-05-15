package lt.vu.mif.lab1psk.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

@Interceptor
@Logger
public class MethodLogger implements Serializable {
    @AroundInvoke
    public Object logMethodInvocation(InvocationContext ctx) throws Exception {
        System.out.println("Metodas: " + ctx.getMethod().getName());
        return ctx.proceed();
    }
}
