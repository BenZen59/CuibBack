package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "roleStaff")
@Table(name = "roleStaff")
public class RoleStaff {
    @Id
    @Column(name = "idRoleStaff")
    private int idRoleStaff;
    @Column(name = "libelle")
    private String libelle;
}
