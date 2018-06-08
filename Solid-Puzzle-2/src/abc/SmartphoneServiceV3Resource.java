/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import abc.bean.SmartphoneServiceBean;
import abc.bean.SmartphoneServiceV3Bean;
import abc.request.QrCodeProcessingRequestV3;
import abc.response.QrCodeProcessingResponseV3;
import org.jboss.seam.validation.AutoValidating;

import ch.adnovum.monexio.server.smartphoneserviceimpl.helper.SmartphoneServiceV3ExceptionMapper;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.ConfirmPaymentResponseV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.CreatePairingRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.CreatePairingResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.InitiatePaymentRequestV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.InitiatePaymentResponseV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.LoadingOptionsResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.MerchantInformationRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.MerchantInformationResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.OrderDetailResponseV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PAcceptRequestMoneyRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PAcceptRequestMoneyResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PRequestMoneyRequestV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PRequestMoneyResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PSendMoneyRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PSendMoneyResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PUpdateStatusRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.P2PUpdateStatusResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.PaymentConfirmation;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.QrCodeProcessingRequestV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.QrCodeProcessingResponseV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SetPinRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartphoneOrderDocument;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartphonePaymentCancellation;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.SmartphoneServiceV3;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherOrderRequest;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherOrderResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherRedeemResponse;
import ch.adnovum.monexio.server.smartphoneserviceintf.rs.VoucherRedeemV2Request;
import ch.nevis.jcan.log.AdnTrace;
import ch.twint.app.processing.common.enums.LockReason;
import ch.twint.app.processing.common.enums.LockStateEnum;
import ch.twint.app.processing.common.heartbeat.AppProcessingHeartBeatData;
import ch.twint.app.processing.common.utils.AppProcessingHeartBeatUtil;

/**
 * @author AdNovum Informatik AG
 */
@Path(SmartphoneServiceV3.VERSION)
public class SmartphoneServiceV3Resource implements SmartphoneServiceV3 {

    @Inject
	private SmartphoneServiceV3Bean smartphoneServiceV3Bean;


	@POST
	@Path("qrCodes")
	@Override
	public QrCodeProcessingResponseV3 qrCodeScan(
			QrCodeProcessingRequestV3 qrCodeProcessingRequest) {
		return smartphoneServiceV3Bean.qrCodeScan(qrCodeProcessingRequest);
	}

}
