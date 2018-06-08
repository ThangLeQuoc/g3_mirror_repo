/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.response;

/**
 * @author AdNovum Informatik AG
 */
public class QrCodeProcessingResponseV4 {

	private UofRegistrationResponse uofRegistration;

	private QrCodeProcessingResponseV3 qrCodeProcessingResponseV3;

	public QrCodeProcessingResponseV4() {
	}

	public UofRegistrationResponse getUofRegistration() {
		return uofRegistration;
	}

	public void setUofRegistration(UofRegistrationResponse uofRegistration) {
		this.uofRegistration = uofRegistration;
	}

	public QrCodeProcessingResponseV3 getQrCodeProcessingResponseV3() {
		if (qrCodeProcessingResponseV3 == null) {
			qrCodeProcessingResponseV3 = new QrCodeProcessingResponseV3();
		}
		return qrCodeProcessingResponseV3;
	}

	public void setQrCodeProcessingResponseV3(QrCodeProcessingResponseV3 qrCodeProcessingResponseV3) {
		this.qrCodeProcessingResponseV3 = qrCodeProcessingResponseV3;
	}
}