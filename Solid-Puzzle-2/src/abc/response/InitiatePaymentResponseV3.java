/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $$Revision$$
 * Date of last edit : $$Date$$
 */

package abc.response;

/**
 * @author AdNovum Informatik AG
 */
public class InitiatePaymentResponseV3 extends InitiatePaymentResponseV2 {
	

	public InitiatePaymentResponseV3() {}

	public InitiatePaymentResponseV3(InitiatePaymentResponse response) {
		setInitiatePaymentResponseV1(response);
	}

	public InitiatePaymentResponseV3(InitiatePaymentResponseV2 response) {
		setInitiatePaymentResponseV2(response);
	}

	protected void setInitiatePaymentResponseV1(InitiatePaymentResponse response) {
		this.setStatus(response.getStatus());
	}

	protected void setInitiatePaymentResponseV2(InitiatePaymentResponseV2 response){
		setInitiatePaymentResponseV1(response);

		this.setCouponsPossible(response.getCouponsPossible());
	}

}
