package ploy.testEx2;

public abstract  class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) { // 카카오 선택 시
            return new KakaoPay();
        } else if (option.equals("naver")) { // 네이버 선택 시
            return new NaverPay();
        } else if (option.equals("apple")) { // 애플 선택 시
            return new ApplePay();
        } else {
            return new DefaultPay();
        }
    }
}
