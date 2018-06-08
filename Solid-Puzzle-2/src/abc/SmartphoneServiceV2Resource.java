package abc;

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import abc.bean.SmartphoneServiceBean;
import abc.request.QrCodeProcessingRequest;
import abc.response.QrCodeProcessingResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.CheckClientVersionResponseV2;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.ClientVersionInfo;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.MobileDeviceCharacteristics;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartbeaconInfoListResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartphoneService;
import ch.twint.app.processing.common.enums.LockStateEnum;
import org.jboss.seam.validation.AutoValidating;

import com.fasterxml.jackson.databind.JsonNode;

import ch.adnovum.monexio.server.smartphoneserviceintf.rs.CheckoutMessageDataFromSAS;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.FindCheckoutMessageViaSASRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.FindHomestreamMessagesViaSASRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.FindMartketplaceMessagesViaSASRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.FindMessageContentsViaCmsRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.HomestreamMessageDataFromSAS;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.LoadingOptionsResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.MarketplaceMessageDataFromSAS;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.MessageStatusSASUpdateData;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.OrderDetailResponseV2;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.PushTokenRequestV2;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SasMessageAction;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SasMessageInformation;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SasWalletMessageAction;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartphoneServiceV2;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherRedeemResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherRedeemV2Request;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.WalletMessageDataFromSAS;
import ch.nevis.jcan.log.AdnTrace;
import ch.twint.app.processing.common.dto.DTOList;
import ch.twint.app.processing.common.heartbeat.AppProcessingHeartBeatData;
import ch.twint.app.processing.common.utils.AppProcessingHeartBeatUtil;

/**
 * @author AdNovum Informatik AG
 */
@Path("service"+SmartphoneServiceV2.VERSION)
public class SmartphoneServiceV2Resource implements SmartphoneServiceV2 {

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