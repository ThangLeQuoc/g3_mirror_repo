/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */
package abc;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import abc.bean.SmartphoneServiceBean;
import abc.request.QrCodeProcessingRequest;
import abc.response.QrCodeProcessingResponse;


@Path("service/v1")
public class SmartphoneServiceResource implements SmartphoneService {

    @Inject
    private SmartphoneServiceBean smartphoneServiceBean;


    @POST
    @Path("qrCodes")
    @Override
    public QrCodeProcessingResponse qrCodeScan(
            QrCodeProcessingRequest qrCodeProcessingRequest) {
        return smartphoneServiceBean.qrCodeScan(qrCodeProcessingRequest);
    }
}