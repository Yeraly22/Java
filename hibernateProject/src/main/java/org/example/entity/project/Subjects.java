package org.example.entity.project;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int id;

    @Column(name = "title")
    @NonNull
    private String title;

    @OneToMany(mappedBy = "subjects")
    private List<Marks> marks;

    @ManyToMany(mappedBy = "subjectsList")
    private List<Students> studentsList;

    @ManyToMany
    @JoinTable(
            name = "subject_teacher",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private List<Teachers> teachersList;

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
