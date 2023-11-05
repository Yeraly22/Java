package org.example.entity.project;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "marks")
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private int id;

    @Column(name = "mark")
    @NonNull
    private int mark;

    @ManyToOne
    @JoinColumn(name = "subject_id" , referencedColumnName = "subject_id")
    private Subjects subjects;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Students students;

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", mark=" + mark +
                '}';
    }
}
