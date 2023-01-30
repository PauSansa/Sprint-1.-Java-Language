package n2exercici1;

import java.io.File;
import java.io.FileWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Serializador {

    public void guardarAJson(Object object){
        File f;
        FileWriter fw;

        Class<?> clase = object.getClass();
        Serialitzable anotacion = clase.getAnnotation(Serialitzable.class);
        String path = anotacion.path();


        try{
            f = new File(path);
            fw = new FileWriter(f);

            fw.write(convertToJson(object));
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public String convertToJson(Object object) throws NoSerializableException {
        try {

            comprobaSiSerializable(object);
            initElements(object);
            return getStringJson(object);

        } catch (Exception e) {
            throw new NoSerializableException(e.getMessage());
        }
    }

    private void comprobaSiSerializable(Object object) throws NoSerializableException {
        if (Objects.isNull(object)) {
            throw new NoSerializableException("No es pot serialitzar un objecte buit ");
        }

        Class<?> clase = object.getClass();
        if (!clase.isAnnotationPresent(Serialitzable.class)) {
            throw new NoSerializableException("La clase " + clase.getSimpleName() + " no es serialitzable");
        }
    }

    private String getStringJson(Object object) throws IllegalArgumentException, IllegalAccessException{
        Class<?> clase = object.getClass();
        Map<String, String> mapJson = new HashMap<>();
        for (Field field : clase.getDeclaredFields()){
            field.setAccessible(true);
            if (field.isAnnotationPresent(ElementJson.class)){
                mapJson.put(getKey(field), (String) field.get(object));
            }
        }

        //No ho entenc pero es el següent tema
        String jsonString = mapJson.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }

    private void initElements(Object object) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clase = object.getClass();
        for(Method metode : clase.getDeclaredMethods()) {
            if (metode.isAnnotationPresent(Init.class)){
                metode.setAccessible(true);
                metode.invoke(object);
            }
        }
    }


    private String getKey(Field field) {
        String value = field.getAnnotation(ElementJson.class).key();
        return value.isEmpty() ? field.getName() : value;
    }
}
