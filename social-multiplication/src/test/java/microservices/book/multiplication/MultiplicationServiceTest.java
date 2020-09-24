package microservices.book.multiplication;

import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.User;
import microservices.book.multiplication.service.MultiplicationService;
import microservices.book.multiplication.service.RandomGeneratorService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MultiplicationServiceTest {
	@MockBean
	private RandomGeneratorService randomGeneratorService;
	@Autowired
	private MultiplicationService multiplicationService;

	@Test
	public void createRandomMultiplicationTest() {
		given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
		Multiplications multiplication = multiplicationService.createRandomMultiplication();
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
	}

	@Test
	public void checkCorrectAttemptTest() {
	// given
	Multiplications multiplication = new Multiplications(50, 60);
	User user = new User("john_doe");
//	MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000,false);
//	// when
//	boolean attemptResult = multiplicationService.checkAttempt(attempt);
//	// assert
//	assertThat(attemptResult).isTrue();
	}

	@Test
	public void checkWrongAttemptTest() {
	// given
	Multiplications multiplication = new Multiplications(50, 60);
	User user = new User("john_doe");
//	MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010,false);
//	// when
//	boolean attemptResult = multiplicationService.checkAttempt(attempt);
//	// assert
//	assertThat(attemptResult).isFalse();
	}
}
