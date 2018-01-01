package com.trainings.ws.soap;

import com.trainings.ws.soap.dto.PaymentProcessorRequest;
import com.trainings.ws.soap.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

	public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest);
}
