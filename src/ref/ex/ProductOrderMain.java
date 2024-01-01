package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 1);

        printOrder(productOrder1);
        printOrder(productOrder2);
        printOrder(productOrder3);


    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrder(ProductOrder productOrder){
        System.out.println("상품명:" + productOrder.productName + " 가격:" + productOrder.price + " 수량:"
                            + productOrder.quantity);
    }

}
