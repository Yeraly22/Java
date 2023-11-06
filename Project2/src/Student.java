import java.io.Serializable;

public class Student implements Serializable,Info {
    private Integer id;
    private String name;
    private String surname;
    private String groups;
    private String profession;



    public Student(String name, String surname, String groups, String profession) {
        this.name = name;
        this.surname = surname;
        this.groups = groups;
        this.profession = profession;
    }

    public Student(Integer id, String name, String surname, String groups, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groups = groups;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String info() {
        return id +" "+ name + " " + surname + " " + groups + " " +profession ;
    }
}
