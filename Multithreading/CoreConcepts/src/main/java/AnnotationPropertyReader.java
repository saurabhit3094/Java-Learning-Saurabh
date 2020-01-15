import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class AnnotationPropertyReader {

    public void assignPropertyToVariable(Object object){

        Properties prop = new Properties();
        try {

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("xyz.properties");
            if (inputStream!=null)
            prop.load(inputStream);
            else System.out.println("input stream is null");

            if (object !=null) {
                Class<?> objectClass = object.getClass();

                for(Field field : objectClass.getDeclaredFields()){
                    if(field.isAnnotationPresent(Value.class)){
                        field.set(object,prop.getProperty(field.getAnnotation(Value.class).key()));
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
