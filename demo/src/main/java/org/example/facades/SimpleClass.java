package org.example.facades;


import java.lang.reflect.Field;
import java.util.List;

public class SimpleClass implements IClassFacade {

    public SimpleClass(Class<?> clazz) {
        this.clazz = clazz;
    }

    private Class<?> clazz;


    public List<IMethodFacade> getPublicDeclaredMethods(){
        return null;
    }
    @Override
    public List<IMethodFacade> getPublicGetters(){
        return null;
    }


    @Override
    public List<IMethodFacade> getPublicSetters(){


        return null;
    }


    @Override
    public List<Field> getFieldsForPublicProperties(){

        return null;

    }


}
