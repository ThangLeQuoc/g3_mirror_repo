/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.response;

/**
 * @author AdNovum Informatik AG
 */
public class QrCodeProcessingResponseV3 extends  QrCodeProcessingResponse {

	private InitiatePaymentResponseV3 initiatePayment;
	
	public QrCodeProcessingResponseV3() {}
	
	public QrCodeProcessingResponseV3(QrCodeProcessingResponse qrCodeProcessingResponse) {
		setQrCodeProcessingResponseV1(qrCodeProcessingResponse);
	}

	protected void setQrCodeProcessingResponseV1(QrCodeProcessingResponse qrCodeProcessingResponse) {
		this.setIdentifier(qrCodeProcessingResponse.getIdentifier());
		this.setInitiatePayment(qrCodeProcessingResponse.getInitiatePayment());
	}

	@Override
	public InitiatePaymentResponseV3 getInitiatePayment() {
		return initiatePayment;
	}

	public void setInitiatePayment(InitiatePaymentResponseV3 initiatePayment) {
		this.initiatePayment = initiatePayment;
	}
}