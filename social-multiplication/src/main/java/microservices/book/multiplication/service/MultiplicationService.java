package microservices.book.multiplication.service;

import java.util.List;

import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.User;

public interface MultiplicationService {
	/**
	 * Creates a Multiplication object with two randomly-generated factors between
	 * 11 and 99.
	 *
	 * @return a Multiplication object with random factors
	 */
	Multiplications createRandomMultiplication();

	boolean checkAttempt(MultiplicationResultAttempt resultAttempt);

	List<MultiplicationResultAttempt> getStatsForUser(String userAlias);

	public Multiplications SaveUser();
	
	 MultiplicationResultAttempt getResultById(final Long resultId);
}
