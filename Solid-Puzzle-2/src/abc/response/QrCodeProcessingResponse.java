/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.response;

import abc.QrTypeEnum;

/**
 * @author AdNovum Informatik AG
 */
public class QrCodeProcessingResponse {
	
	private QrTypeEnum identifier;
	
	private InitiatePaymentResponse initiatePayment;
	


	public QrTypeEnum getIdentifier() {
		return identifier;
	}

	public void setIdentifier(QrTypeEnum identifier) {
		this.identifier = identifier;
	}

	public InitiatePaymentResponse getInitiatePayment() {
		return initiatePayment;
	}

	public void setInitiatePayment(InitiatePaymentResponse initiatePayment) {
		this.initiatePayment = initiatePayment;
	}

	
}