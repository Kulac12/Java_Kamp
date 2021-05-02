
package pkg009_odev1;

public class Course {
    //kursun özelliklerini tanımlayan bir class oluşturdum.
    public Course(){
        System.out.println("kurucu metot oluşturdum.");
    }
    public Course(int id, String name,String details, String instructorName,double price){
        this.id=id;
        this.name=name;
        this.details=details;
        this.price=price;
        this.instructorName=instructorName;
        
    }
    
    int id; //kursun id si
    String name;  //kursun adı
    String details; //kurs detaylarını tutuyor
    String instructorName; //kursu veren eğitmenin ismi
    double price;
    
}
