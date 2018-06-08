/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import abc.bean.SmartphoneServiceV4Bean;
import abc.request.QrCodeProcessingRequestV4;
import abc.response.QrCodeProcessingResponseV4;


public class SmartphoneServiceV4Resource implements SmartphoneServiceV4 {

	@Inject
	private SmartphoneServiceV4Bean smartphoneServiceV4Bean;

	@POST
	@Path("qrCodes")
	@Override
	public QrCodeProcessingResponseV4 qrCodeScan(QrCodeProcessingRequestV4 qrCodeProcessingRequest) {
		return smartphoneServiceV4Bean.qrCodeScan(qrCodeProcessingRequest);
	}
}
