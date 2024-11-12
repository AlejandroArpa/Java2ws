enum Gender {
    male,
    female,
    other
}

class  Person {
    public String name;
    public int age;
    public Gender gender;

    Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void compareAges (Person subject2) {
        if(this.age > subject2.age) {
            System.out.println(this.name+" is the older");
        } else if (this.age < subject2.age) {
            System.out.println(subject2.name+" is the older");
        }
        else {
            System.out.println(subject2.name + " and " + this.name + " have the same age");
        }
    }
}

public class Ejercicio4 {
    public static  void main(String[] args){

    }
}
