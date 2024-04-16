package study2.class1.ex1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder p1 = new ProductOrder();
        p1.productName = "맥북";
        p1.productPrice = 2000;
        p1.productQuantity = 5;

        ProductOrder p2 = new ProductOrder();
        p2.productName = "에어팟";
        p2.productPrice = 3000;
        p2.productQuantity = 4;

        ProductOrder [] productOrders = new ProductOrder[] { p1, p2 };
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.productPrice +
                               " 수량 : " + productOrder.productQuantity +
                               " 최종 결제 금액 : " + productOrder.productPrice * productOrder.productQuantity);
        }


    }
}
