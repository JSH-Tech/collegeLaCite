use northwind;

-- select orders.*, employees.last_name,employees.first_name from northwind.orders inner join employees on orders.employee_id =employees.id;

-- select orders.*, customers.last_name from orders inner join customers on orders.customer_id=customers.id where customers.last_name="Lee"; 

-- select orders.ship_address, orders.ship_city, orders.ship_country_region, orders.ship_state_province, orders.ship_zip_postal_code, products.product_name from orders
-- inner join order_details on order_details.order_id=orders.id 
-- inner join products on order_details.product_id=products.id where products.product_name="Northwind Traders Curry Sauce";

select products.*,orders.id from products inner join order_details on order_details.product_id=products.id 
inner join orders on order_details.order_id=orders.id where orders.id="42";

select 