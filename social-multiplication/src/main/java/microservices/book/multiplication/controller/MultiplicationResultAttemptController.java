package microservices.book.multiplication.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.domain.User;
import microservices.book.multiplication.service.MultiplicationService;

@RestController
@RequestMapping("/results")
public class MultiplicationResultAttemptController {
	private final MultiplicationService multiplicationService;

	MultiplicationResultAttemptController(final MultiplicationService multiplicationService) {
		this.multiplicationService = multiplicationService;
	}

	@PostMapping
	ResponseEntity<MultiplicationResultAttempt> postResult(
			@RequestBody MultiplicationResultAttempt multiplicationResultAttempt) {
		boolean isCorrect = multiplicationService.checkAttempt(multiplicationResultAttempt);
		MultiplicationResultAttempt attemptCopy = new MultiplicationResultAttempt(multiplicationResultAttempt.getUser(),
				multiplicationResultAttempt.getMultiplication(), multiplicationResultAttempt.getResultAttempt(),
				isCorrect);
		return ResponseEntity.ok(attemptCopy);
	}

	@GetMapping
	ResponseEntity<List<MultiplicationResultAttempt>> getStatistics(@RequestParam("alias") String alias) {
		return ResponseEntity.ok(multiplicationService.getStatsForUser(alias));
	}

	@GetMapping("/user")
	ResponseEntity<Multiplications> getTest() {
		return ResponseEntity.ok(multiplicationService.SaveUser());
	}

	@GetMapping("/{resultId}")
	ResponseEntity<MultiplicationResultAttempt> getResultById(final @PathVariable("resultId") Long resultId) {
		return ResponseEntity.ok(multiplicationService.getResultById(resultId));
	}

	// Here we'll implement our POST later
	@Data
	public static final class ResultResponse {
		private final boolean correct;
	}
}
