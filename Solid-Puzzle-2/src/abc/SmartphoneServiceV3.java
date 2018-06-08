/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc;

import abc.request.QrCodeProcessingRequestV3;
import abc.response.QrCodeProcessingResponseV3;

/**
 * @author AdNovum Informatik AG
 */
public interface SmartphoneServiceV3 {

    String VERSION = "v3";

	QrCodeProcessingResponseV3 qrCodeScan(QrCodeProcessingRequestV3 qrCodeProcessingRequest);
}
