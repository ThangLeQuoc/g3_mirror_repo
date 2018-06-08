package abc;

public class QRCodeData {

	private QrTypeEnum qrType;

	private String content;

	public QrTypeEnum getQrType() {
		return qrType;
	}

	public void setQrType(QrTypeEnum qrType) {
		this.qrType = qrType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
