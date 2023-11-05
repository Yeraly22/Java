package org.example.entity.project;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column(name = "firstname")
    @NonNull
    private String firstname;

    @Column(name = "lastname")
    @NonNull
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "group_id" , referencedColumnName = "group_id")
    private Groups groups;

    @OneToMany(mappedBy = "students")
    private List<Marks> marks;

    @ManyToMany
    @JoinTable(
            name = "marks",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subjects> subjectsList;


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
