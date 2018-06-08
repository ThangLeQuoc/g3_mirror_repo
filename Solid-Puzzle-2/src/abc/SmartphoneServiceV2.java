package abc;

import abc.request.QrCodeProcessingRequest;
import abc.response.QrCodeProcessingResponse;

/**
 * @author AdNovum Informatik AG
 */
public interface SmartphoneServiceV2{

    String VERSION = "v1";

    QrCodeProcessingResponse qrCodeScan(QrCodeProcessingRequest qrCodeProcessingRequest);
}
