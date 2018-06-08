/*
 * Author            : AdNovum Informatik AG
 * Version Number    : $Revision$
 * Date of last edit : $Date$
 */

package abc.request;

/**
 * @author AdNovum Informatik AG
 */
public class QrCodeProcessingRequestV3 extends  QrCodeProcessingRequest {

    private boolean requireUserConfirmation = false;

    public boolean isRequireUserConfirmation() {
        return requireUserConfirmation;
    }

    public void setRequireUserConfirmation(boolean requireUserConfirmation) {
        this.requireUserConfirmation = requireUserConfirmation;
    }
}