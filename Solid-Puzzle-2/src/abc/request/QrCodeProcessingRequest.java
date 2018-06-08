/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.request;

import java.util.UUID;

/**
 * @author AdNovum Informatik AG
 */
public class QrCodeProcessingRequest {
	
	private String qrCode;

	private UUID orderUuid;

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public UUID getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(UUID orderUuid) {
		this.orderUuid = orderUuid;
	}
}