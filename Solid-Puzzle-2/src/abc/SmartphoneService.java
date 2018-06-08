/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc;

import abc.request.QrCodeProcessingRequest;
import abc.response.QrCodeProcessingResponse;

public interface SmartphoneService{

	String VERSION = "v1";

	QrCodeProcessingResponse qrCodeScan(QrCodeProcessingRequest qrCodeProcessingRequest);
}