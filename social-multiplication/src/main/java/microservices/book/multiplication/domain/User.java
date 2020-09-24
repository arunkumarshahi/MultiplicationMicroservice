package microservices.book.multiplication.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity@EqualsAndHashCode(exclude = {"multiplicationResultAttempt"})
@ToString(exclude = {"multiplicationResultAttempt"})
public final class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;
	private String alias;
	private String email;
	@OneToOne
    private MultiplicationResultAttempt multiplicationResultAttempt;
	public User(String name) {
		alias = name;
	}

	public User() {
		alias = null;
	}

}
