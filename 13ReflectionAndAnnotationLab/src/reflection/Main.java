package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());
        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> declaredConstructor = clazz.getDeclaredConstructor();
        Reflection reflection = declaredConstructor.newInstance();
        System.out.println(reflection);
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        Class<Reflection> clazz = Reflection.class;
//
//        System.out.println(clazz);
//        System.out.println(clazz.getSuperclass().getSimpleName());
//
//        try {
//            Arrays.stream(clazz.getInterfaces())
//                    .map(Class::getSimpleName)
//                    .forEach(System.out::println);
//
//            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
//            ctor.setAccessible(true);
//            Reflection reflection = ctor.newInstance();
//
//            System.out.println(reflection);
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
//            ex.printStackTrace();
//        }
//
//
//
//
//    }
//
//}
