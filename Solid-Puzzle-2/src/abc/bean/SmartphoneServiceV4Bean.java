/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.bean;

import abc.QRCodeData;
import abc.response.UofRegistrationResponse;
import abc.request.QrCodeProcessingRequestV4;
import abc.response.QrCodeProcessingResponseV4;

public class SmartphoneServiceV4Bean {

	@Inject
	private SmartphoneServiceV3Bean smartphoneServiceV3Bean;

    public QrCodeProcessingResponseV4 qrCodeScan(QrCodeProcessingRequestV4 requestV4) {
        String originalQRCode = requestV4.getQrCode();


		QRCodeData qrCodeData = lookupQrCode(originalQRCode);

		QrCodeProcessingResponseV4 response = new QrCodeProcessingResponseV4();

		switch (qrCodeData.getQrType()) {
			case UOF:
				response = handleUofRegistration(qrCodeData);
				break;

			default:
				response.setQrCodeProcessingResponseV3(smartphoneServiceV3Bean.qrCodeScan(requestV4,
						qrCodeData));
		}


		return response;

    }

	private QRCodeData lookupQrCode(String originalQRCode) {
		// create new from qr code data
    	return new QRCodeData();
	}


	private QrCodeProcessingResponseV4 handleUofRegistration(QRCodeData qrCodeData) {
		QrCodeProcessingResponseV4 response = new QrCodeProcessingResponseV4();
		UofRegistrationResponse uofRegistrationResponse = buildUofRegistrationResponse(qrCodeData);
		response.setUofRegistration(uofRegistrationResponse);
		return response;
	}

	private UofRegistrationResponse buildUofRegistrationResponse(QRCodeData qrCodeData) {
    	// create new from qr code data
    	return new UofRegistrationResponse();
	}
}
