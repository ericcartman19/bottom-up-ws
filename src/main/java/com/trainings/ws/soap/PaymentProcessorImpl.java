package com.trainings.ws.soap;

import org.apache.cxf.common.util.StringUtils;

import com.trainings.ws.soap.dto.PaymentProcessorRequest;
import com.trainings.ws.soap.dto.PaymentProcessorResponse;


public class PaymentProcessorImpl implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(
			PaymentProcessorRequest paymentProcessorRequest) {
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		
		String cardNumber = paymentProcessorRequest.getCreditCardInfo().getCardNumber();
		if(StringUtils.isEmpty(cardNumber)) {
			throw new RuntimeException("Invalid Card Number");
		}
		//Business Logic or a call  to a Business Logic Class Goes Here.
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
