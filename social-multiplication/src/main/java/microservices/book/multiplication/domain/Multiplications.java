package microservices.book.multiplication.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * This class represents a Multiplication in our application.
 */
@Data
@Entity
public final class Multiplications {
	@Id
	@GeneratedValue
	@Column(name = "MULTI_ID")
	private Long id;
	// Both factors
	private final int factorA;
	private final int factorB;

	// The result of the operation A * B
	private int result;

	public Multiplications(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = factorA * factorB;
	}

	// Empty constructor for JSON/JPA
	Multiplications() {
		this(0, 0);
	}

}