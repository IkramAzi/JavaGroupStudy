package StudyGiudeJava;

public class Task4_Encapsulation {

  private int age;
  private String name;

    public Task4_Encapsulation(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task4_Encapsulation{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}
