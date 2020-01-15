public class AnnotationTestClass {

    @Value(key="test.name")
    String name;

    @Value(key="test.skill")
    String skill;

    @Value(key="test.experience")
    String exp;

    @Value(key = "test.place")
    String place;

    public static void main(String[] args) {
        try {

            AnnotationTestClass annotationTestClass = new AnnotationTestClass();
            AnnotationPropertyReader annotationPropertyReader = new AnnotationPropertyReader();
            annotationPropertyReader.assignPropertyToVariable(annotationTestClass);
            annotationTestClass.printProperties();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void printProperties(){
        System.out.println("name is ::: " + name + " skill is ::: " + skill + " exp is ::: " + exp + " place is :: " + place);
    }

}
