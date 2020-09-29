package microservices.book.multiplication.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import microservices.book.multiplication.domain.Multiplications;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.User;
import microservices.book.multiplication.service.MultiplicationService;
import static microservices.book.multiplication.controller.MultiplicationResultAttemptController.ResultResponse;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
@Slf4j
@ExtendWith(SpringExtension.class)
@WebMvcTest(MultiplicationResultAttemptController.class)
public class MultiplicationResultAttemptControllerTest {
	@MockBean
	private MultiplicationService multiplicationService;
	@Autowired
	private MockMvc mvc;
	// These objects will be magically initialized by the initFields method below.
	private JacksonTester<MultiplicationResultAttempt> jsonResult;
	private JacksonTester<ResultResponse> jsonResponse;

	@BeforeEach
	public void setup() {
		JacksonTester.initFields(this, new ObjectMapper());
	}

	@Test
	public void postResultReturnCorrect() throws Exception {
		genericParameterizedTest(true);
	}

	@Test
	public void postResultReturnNotCorrect() throws Exception {
		genericParameterizedTest(false);
	}

	void genericParameterizedTest(final boolean correct) throws Exception {
		// given (remember we're not testing here the service itself)
		//when(multiplicationService.checkAttempt(any(MultiplicationResultAttempt.class))).willReturn(correct);
		//when(multiplicationService.checkAttempt(any(MultiplicationResultAttempt.class))).thenReturn(correct);
//		 MyList listMock = mock(MyList.class);
//		 when(listMock.add(anyString())).thenReturn(false);
		log.info("multiplicationService...."+multiplicationService);
		//given(multiplicationService.checkAttempt(any(MultiplicationResultAttempt.class))).willReturn(correct);
		User user = new User("john");
		Multiplications multiplication = new Multiplications(50, 70);
	//	MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3500,correct);

		// when
//		MockHttpServletResponse response = mvc.perform(
//				post("/results").contentType(MediaType.APPLICATION_JSON).content(jsonResult.write(attempt).getJson()))
//				.andReturn().getResponse();

		// then
//		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//		assertThat(response.getContentAsString()).isEqualTo(jsonResponse.write(new ResultResponse(correct)).getJson());
	}

}