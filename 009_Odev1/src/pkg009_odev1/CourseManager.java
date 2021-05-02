
package pkg009_odev1;

//kursu ilgilendiren metodları buraya yazıyoruz.
public class CourseManager {
    public void register(Course course){ //Course classından türetilmiş nesneyi parametre olarak al
        System.out.println("Kurs hesabınıza eklendi. : "+ course.name);
    }
    
    public void deleteRecord(Course course){
        System.out.println("Kurs hesabınızdan silindi. :"+ course.name);
    }
}
