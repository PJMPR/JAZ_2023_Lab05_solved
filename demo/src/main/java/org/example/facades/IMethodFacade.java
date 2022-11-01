package org.example.facades;

import java.lang.reflect.Method;

public interface IMethodFacade {
    boolean isPublic();

    boolean startsWith(String prefix);

    boolean isVoid();

    boolean paramsCountEquals(int count);

    boolean isGetter();

    boolean isSetter();

    String getFieldName();

    Method GetUnderlyingMethod();
}
