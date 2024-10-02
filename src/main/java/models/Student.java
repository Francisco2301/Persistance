package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
@Getter
@Setter
public class Student {
    @Id
    private Long id;
    private String name;
    private 
}
