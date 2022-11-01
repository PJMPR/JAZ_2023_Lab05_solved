package org.example.facades;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Locale;

public class SimpleMethod implements IMethodFacade {
    Method method;
    public SimpleMethod(Method m) {
        method=m;
    }

    @Override
    public boolean isPublic() {
        return false;
    }

    @Override
    public boolean startsWith(String prefix) {
        return false;
    }

    @Override
    public boolean isVoid() {
        return false;
    }

    @Override
    public boolean paramsCountEquals(int count) {
        return false;
    }

    @Override
    public boolean isGetter(){
        return false;
    }

    @Override
    public  boolean isSetter(){
        return false;
    }

    @Override
    public String getFieldName(){
     return null;
    }

    @Override
    public Method GetUnderlyingMethod() {
        return null;
    }
}
