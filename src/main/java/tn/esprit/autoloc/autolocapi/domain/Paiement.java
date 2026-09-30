package tn.esprit.autoloc.autolocapi.domain;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaiement;
    private double montant;
    private LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    private ModePaiement CARTE ;
    private ModePaiement ESPECES ;
    private ModePaiement VIREMENT;
}
