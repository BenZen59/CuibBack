package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "travailler")
@Getter
public class Travailler {
    @Id
    @ManyToOne
    @JoinColumn(name = "idStaff", referencedColumnName = "idStaff")
    private Staff staff;
    @Id
    @ManyToOne
    @JoinColumn(name = "idRoleStaff", referencedColumnName = "idRoleStaff")
    private RoleStaff roleStaff;
}
