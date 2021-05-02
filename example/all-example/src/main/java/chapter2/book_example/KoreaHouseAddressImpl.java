package chapter2.book_example;

public class KoreaHouseAddressImpl implements HouseAddress{

	private String postCode;
	private String address;
	private String detailAddress;

	public KoreaHouseAddressImpl(String postCode, String address, String detailAddress){
		this.postCode = postCode;
		this.address = address;
		this.detailAddress = detailAddress;
	}

	@Override
	public String getPostCode() {
		return postCode;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getDetailAddress() {
		return detailAddress;
	}
}
