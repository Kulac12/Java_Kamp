
package pkg009_odev1;

public class Main {

    public static void main(String[] args) {
        
        //Course classından bir nesne oluşturucam
        Course course1=new Course(1, "Java", "21 Nisan'da başlıyoruz", "Engin Demirog", 0);
        Course course2=new Course(2, "C#", "2 ay sürecek yazılım geliştirme kampımızın...", "Engin Demirog", 0);
        
        Course[] courses = {course1,course2}; 
        
        for(Course kurs: courses){
            System.out.println(kurs.name);
            System.out.println(kurs.details);
            System.out.println(kurs.instructorName);
            System.out.println(kurs.price);
            System.out.println("----------------");
        }
        //Bu nesneyi hesabıma eklyeceğim
        
        Instructor ınInstructor1=new Instructor(1, "Engin Demirog", "MCT, PMP, ITIL");
        Instructor[] ınInstructors={ınInstructor1};
        for(Instructor ınInstructor:ınInstructors){
            System.out.println(ınInstructor.name);
            System.out.println(ınInstructor.details);
        }
    }
    
}
