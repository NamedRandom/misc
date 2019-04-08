public class Person{
    private String name;
    private int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean equals(Person p1){
        if(ageEquals(p1) && nameEquals(p1)) return true;
        else return false;
    }
    public boolean ageEquals(Person p1){
        if(p1.getAge()==age) return true;
        else return false;
    }
    public boolean nameEquals(Person p1){
        if(p1.getName().equals(name)) return true;
        else return false;
    }
    public boolean isOlderThan(Person p1){
        if(age > p1.getAge()) return true;
        else return false;
    }
    public boolean isYoungerThan(Person p1){
        if(age < p1.getAge()) return true;
        else return false;
    }

}
