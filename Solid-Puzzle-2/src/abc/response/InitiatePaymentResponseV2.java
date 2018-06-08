/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $$Revision$$
 * Date of last edit : $$Date$$
 */

package abc.response;

/**
 * @author AdNovum Informatik AG
 */
public class InitiatePaymentResponseV2 extends InitiatePaymentResponse {



	private Boolean couponsPossible;


	public static InitiatePaymentResponseV2 from(InitiatePaymentResponse response) {
		InitiatePaymentResponseV2 result = new InitiatePaymentResponseV2();
		return result;
	}

	public Boolean getCouponsPossible() {
		return couponsPossible;
	}

	public void setCouponsPossible(Boolean couponsPossible) {
		this.couponsPossible = couponsPossible;
	}
}
