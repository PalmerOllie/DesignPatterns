package designPatterns.structural.proxyExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object obj;
    private SecurityProxy(Object obj) {
        this.obj = obj;
    }


    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj));
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if(method.getName().contains("post")) { ///Here we disallow all methods that are contain the keyword (obviously this is not a very robust way to secure the twitter class but it's easy to see how any functionality could fit here)
                throw new IllegalArgumentException("Posts are currently not allowed");
            }
            else {
                result = method.invoke(obj, args);
            }
        }
        catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
        catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }
}
