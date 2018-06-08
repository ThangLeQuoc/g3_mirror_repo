/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc;

import abc.request.QrCodeProcessingRequestV4;
import abc.response.QrCodeProcessingResponseV4;

public interface SmartphoneServiceV4{

    QrCodeProcessingResponseV4 qrCodeScan(QrCodeProcessingRequestV4 qrCodeProcessingRequest);

}