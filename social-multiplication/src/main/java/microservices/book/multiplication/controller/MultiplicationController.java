package microservices.book.multiplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.service.MultiplicationService;
import net.bytebuddy.implementation.bytecode.Multiplication;

@RestController
@RequestMapping("/multiplications")
public class MultiplicationController {
	private final MultiplicationService multiplicationService;

	public MultiplicationController(final MultiplicationService multiplicationService) {
		this.multiplicationService = multiplicationService;
	}

	@GetMapping("/random")
	Multiplications getRandomMultiplication() {
		return multiplicationService.createRandomMultiplication();
	}
	
	@GetMapping
	String getTestRandomMultiplication() {
		return "Hello Arun";
	}
}
