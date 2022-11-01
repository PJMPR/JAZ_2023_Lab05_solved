package org.example;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Class<Subject> subjectClass = Subject.class;
        //firstExerciseForMethodFacades(subjectClass);
        //secondExerciseForClassFacades();
    }



    private static void firstExerciseForMethodFacades(Class<Subject> subjectClass) throws Exception {
//        var setSomethingMethod = subjectClass.getDeclaredMethod("setSomething", Object.class);
//        var emptyMethod = subjectClass.getDeclaredMethod("emptyMethod");
//        var getterMethod = subjectClass.getDeclaredMethod("getNumber");
//        var setterMethod = subjectClass.getDeclaredMethod("setNumber");
//
//
//        IMethodFacade simplePrivateMethod = new SimpleMethod(setSomethingMethod);
//        IMethodFacade simplePublicMethod = new SimpleMethod(emptyMethod);
//        IMethodFacade getterFacade = new SimpleMethod(getterMethod);
//        IMethodFacade setterFacade = new SimpleMethod(setterMethod);
//
//        if(simplePrivateMethod.isPublic()) throw new Exception("metoda setSomething jest prywatna");
//        if(!simplePublicMethod.isPublic()) throw new Exception("metoda emptyMethod jest publiczna");
//        if(!simplePrivateMethod.paramsCountEquals(1) || !simplePublicMethod.paramsCountEquals(0)) throw new Exception("metoda nie sprawdza ilości parametrów");
//        if(!simplePrivateMethod.startsWith("set"))throw new Exception("prefix metody setSomething jest źle sprawdzany");
//        if(!simplePrivateMethod.isVoid()) throw new Exception("metoda setSomething jest typu void");
//        if(simplePublicMethod.isVoid()) throw new Exception("metoda emptyMethod nie jest typu void");
//        if(simplePrivateMethod.isSetter()) throw new Exception("metoda setSomething nie jest setterem");
//        if(simplePublicMethod.isGetter())throw new Exception("metoda emptyMethod nie jest getterem");
//        if(!getterFacade.isGetter())throw new Exception("metoda getNumber jest getterem");
//        if(!setterFacade.isSetter())throw new Exception("metoda setNumber jest setterem");
//        if(!setterFacade.getFieldName().equals("number"))throw new Exception("pole do którego odnosi się właściwość nosi nazwę number");
//        Method underlyingMethod =setterFacade.GetUnderlyingMethod();
//        if(!underlyingMethod.getName().equals("setNumber"))throw new Exception("nie ma dostępu do metody pierwotnej (z której jest zrobiona fasada)");
    }

    private static void secondExerciseForClassFacades() throws Exception {
//        IClassFacade subjectClassFacade = new SimpleClass(Subject.class);
//
//        var publicMethods = subjectClassFacade.getPublicDeclaredMethods();
//        var publicGetters = subjectClassFacade.getPublicGetters();
//        var publicSetters = subjectClassFacade.getPublicSetters();
//        var fieldsWithProperties = subjectClassFacade.getFieldsForPublicProperties();
//
//        if(publicMethods.size()!=14)throw new Exception("nie zwraca wszystkich publicznych metod");
//        if(!areGettersFine(publicGetters))throw new Exception("nie zwraca dobrze wszystkich getterów");
//        if(!areSettersFine(publicSetters))throw new Exception("nie zwraca dobrze wszystkich setterów");
//        if(!areFieldsFine(fieldsWithProperties)) throw new Exception("nie zwraca dobrze wszystkich pól do których jest setter i getter (jednocześnie oba)");
    }

//    private static boolean areFieldsFine(List<Field> fieldsWithProperties) {
//        return fieldsWithProperties.stream()
//                .map(x -> x.getName())
//                .toList().containsAll(List.of("name", "number", "isDone")) && fieldsWithProperties.size() == 3;
//    }

//    private static boolean areGettersFine(List<IMethodFacade> publicGetters) {
//        return publicGetters
//                .stream()
//                .map(y -> y.GetUnderlyingMethod().getName())
//                .toList().containsAll(List.of("getStatus", "getNumber", "isDone", "getName"))
//                && publicGetters.size()==4
//                ;
//    }

//    private static boolean areSettersFine(List<IMethodFacade> publicSetters) {
//        return publicSetters
//                .stream()
//                .map(y -> y.GetUnderlyingMethod().getName())
//                .toList().containsAll(List.of("setName","setNumber","setDone"))
//                && publicSetters.size()==3;
//    }
}
