package microservices.book.gamification.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Event received when a multiplication has been solved in the system. Provides
 * some context information about the multiplication.
 */
@RequiredArgsConstructor
@Data
@ToString
@EqualsAndHashCode

public class MultiplicationSolvedEvent implements Serializable {
	
	private final Long multiplicationResultAttemptId;
	private final Long userId;
	private final boolean correct;
	
	MultiplicationSolvedEvent(){
		multiplicationResultAttemptId=0L;
		userId=0L;
		correct=false;
	}
}