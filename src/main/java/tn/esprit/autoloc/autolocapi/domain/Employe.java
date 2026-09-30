package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEmployee;
    private String Nom;
    private String Prenom;
    @Enumerated(EnumType.STRING)
    private RoleEmploye Role;
}

