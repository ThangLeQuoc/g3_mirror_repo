/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.bean;

import javax.inject.Inject;

import abc.QRCodeData;
import abc.QrTypeEnum;
import abc.request.QrCodeProcessingRequestV3;
import abc.response.InitiatePaymentResponseV3;
import abc.response.QrCodeProcessingResponseV3;


public class SmartphoneServiceV3Bean{

	@Inject
	private SmartphoneServiceBean smartphoneServiceV1Bean;

	public QrCodeProcessingResponseV3 qrCodeScan(QrCodeProcessingRequestV3 requestV3) {
		return qrCodeScan(requestV3, null);
	}

	public QrCodeProcessingResponseV3 qrCodeScan(QrCodeProcessingRequestV3 requestV3, QRCodeData qrCodeData) {

		if (qrCodeData == null) {
			String originalQRCode = requestV3.getQrCode();
		}

		QrCodeProcessingResponseV3 response;

		switch (qrCodeData.getQrType()) {
			case PAYMENT:
				response = handlePaymentQrCode(qrCodeData, requestV3.isRequireUserConfirmation());
				break;

			case VOUCHER:
				response = handleVoucherQrCode(requestV3, qrCodeData);
				break;

			default:
				response = new QrCodeProcessingResponseV3(
						smartphoneServiceV1Bean.qrCodeScan(requestV3));
		}


		return response;

	}

	private QrCodeProcessingResponseV3 handleVoucherQrCode(
			QrCodeProcessingRequestV3 requestV3, QRCodeData qrCodeData) {

		QrCodeProcessingResponseV3 response = new QrCodeProcessingResponseV3();
		response.setIdentifier(QrTypeEnum.PAYMENT);
		response.setInitiatePayment(buildInitiatePaymentResponseV3());

		return response;
	}


	private QrCodeProcessingResponseV3 handlePaymentQrCode(QRCodeData qrCodeData, boolean requireUserConfirmation) {
		InitiatePaymentResponseV3 initiatePaymentResponse = buildInitiatePaymentResponseV3();

		QrCodeProcessingResponseV3 response = new QrCodeProcessingResponseV3();
		response.setInitiatePayment(initiatePaymentResponse);

		return response;
	}

	private InitiatePaymentResponseV3 buildInitiatePaymentResponseV3() {
		// build response
		return  new InitiatePaymentResponseV3();
	}

}

