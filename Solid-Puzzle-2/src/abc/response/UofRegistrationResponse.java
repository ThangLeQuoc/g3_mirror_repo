/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.response;

import java.util.Date;
import java.util.UUID;


public class UofRegistrationResponse {


	private UUID orderUuid;


	public UUID getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(UUID orderUuid) {
		this.orderUuid = orderUuid;
	}
}
