package org.example.entity.project;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int id;

    @Column(name = "firstname")
    @NonNull
    private String firstname;

    @Column(name = "lastname")
    @NonNull
    private String lastname;

    @ManyToMany(mappedBy = "teachersList")
    private List<Subjects> subjectsList;

    @ManyToMany(mappedBy = "teachersList")
    private List<Groups> groupsList;

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
