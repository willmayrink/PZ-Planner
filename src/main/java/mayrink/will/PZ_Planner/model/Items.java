package mayrink.will.PZ_Planner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String groupItem;
    private Double encumbrance;

    @ManyToOne
    @JoinColumn(name = "place_id") // Cria uma coluna 'place_id' em Items referenciando Places
    private Places place; // Campo necessário para o mappedBy em Places
}