package com.trainings.ws.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.trainings.ws.soap.dto.PaymentProcessorRequest;
import com.trainings.ws.soap.dto.PaymentProcessorResponse;
import com.trainings.ws.soap.exception.ServiceException;

@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {

	// @WebParam is not mandatory
	public @WebResult(name="response") PaymentProcessorResponse processPayment(
			@WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest) throws ServiceException;
}
