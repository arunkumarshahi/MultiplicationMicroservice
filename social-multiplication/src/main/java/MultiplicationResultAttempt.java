import lombok.Data;
import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.domain.User;

@Data
public final class MultiplicationResultAttempt {

    private final User user;
    private final Multiplications multiplication;
    private final int resultAttempt;

    // Empty constructor for JSON (de)serialization
    MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }
}