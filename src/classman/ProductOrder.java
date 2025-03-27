package classman;

public class ProductOrder {
	private String productName;
	private int price;
	private int quantity;

	public ProductOrder(String productName, int price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	static class ProductMain {
		public static void main(String[] args) {

			ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
			ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
			ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);
			ProductOrder[] productOrders = new ProductOrder[40];
			productOrders[0] = productOrder1;
			productOrders[1] = productOrder2;
			productOrders[2] = productOrder3;

			int count = 0;
			for (ProductOrder order : productOrders) {
				if (order == null) {
					break;
				}
				System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ",수량: " + order.quantity);
				count = getCount(order, count);
			}
			System.out.println("총 결제 금액: " + count);
		}

		private static int getCount(ProductOrder order, int count) {
			return count += order.price * order.quantity;
		}
	}

}
