package org.example;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public boolean hasAge() {
        if (age > 0) {
            return true;
        }
        return false;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

    public boolean hasAddress() {
        if (city != null) {
            return true;
        }
        return false;
    }

    public void setAddress() {
        if (!hasAddress()) {
            this.city = city + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurName(getSurname()).setAge(getAge()).setAddress(getCity());
    }

}
