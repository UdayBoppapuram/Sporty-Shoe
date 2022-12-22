package dao;
import java.util.List;

import entity.Order;



public interface OrderDAO {
	
	public List<Order> getOrder();
	
	public Order getOrder(int orderId);
	
	public void saveOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	
	public List<Order> getUserOrders(int userId);

}
