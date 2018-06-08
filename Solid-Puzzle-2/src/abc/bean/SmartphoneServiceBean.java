/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.bean;

import abc.QRCodeData;
import abc.request.QrCodeProcessingRequest;
import abc.response.InitiatePaymentResponse;
import abc.response.QrCodeProcessingResponse;

/**
 * @author AdNovum Informatik AG
 */
public class SmartphoneServiceBean {

	public QrCodeProcessingResponse qrCodeScan(QrCodeProcessingRequest qrCodeProcessingRequest) {

		String originalQRCode = qrCodeProcessingRequest.getQrCode();

		QRCodeData qrCodeData = lookupQrCode(originalQRCode);

		QrCodeProcessingResponse response = new QrCodeProcessingResponse();

		switch (qrCodeData.getQrType()) {
			case PAYMENT: {
				// Do some thing and setInitiatePayment
				response.setInitiatePayment(new InitiatePaymentResponse());
				break;
			}
			case VOUCHER: {

				// Do some thing and setInitiatePayment
				response.setInitiatePayment(new InitiatePaymentResponse());
				break;
			}
		}
		return response;
	}


	private QRCodeData lookupQrCode(String originalQRCode) {
		// create new from qr code data
		return new QRCodeData();
	}
}
