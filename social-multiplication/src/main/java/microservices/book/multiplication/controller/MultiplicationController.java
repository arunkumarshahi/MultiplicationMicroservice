package microservices.book.multiplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.service.MultiplicationService;
import net.bytebuddy.implementation.bytecode.Multiplication;

@RestController
@RequestMapping("/multiplications")
@Slf4j
public class MultiplicationController {
	private final MultiplicationService multiplicationService;

	public MultiplicationController(final MultiplicationService multiplicationService) {
		this.multiplicationService = multiplicationService;
	}

	@GetMapping("/random")
	Multiplications getRandomMultiplication() {
		log.info("random ethod called");
		Multiplications multiplications= multiplicationService.createRandomMultiplication();
		log.info("random result called ::: {}",multiplications);
	return multiplications;
	}
	
	@GetMapping
	String getTestRandomMultiplication() {
		return "Hello Arun";
	}
}
