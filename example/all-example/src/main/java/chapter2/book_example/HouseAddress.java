package chapter2.book_example;

public interface HouseAddress {

	// 우편번호를 리턴한다.
	public String getPostCode();

	// 주소 정보를 리턴한다.
	public String getAddress();

	// 상세정보를 리턴한다.
	public String getDetailAddress();
}
