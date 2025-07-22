package syxbruno.com.core.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity(name = "operation")
@AllArgsConstructor
@NoArgsConstructor
public class Operations {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;
  private UUID userId;
  private UUID assetsId;
  private int amount;
  private int unitPrice;
  private TypeOperation type;
  private int brokerage;
  private LocalDateTime date;
}
