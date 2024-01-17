/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLCommand;

/**
 *
 * @author notur
 */



public class SQLCommand {
    
    public static String updateCustomer="UPDATE [dbo].[Customers]\n" +
"   SET [customer_name] = ?\n" +
"      ,[username] = ?\n" +
"      ,[password] = ?\n" +
"      ,[email] = ?\n" +
"      ,[phone] = ?\n" +
"      ,[dob] = ?\n" +
"      ,[status] = ?\n" +
" WHERE customer_id = ?";
    
    
     public static String updateProduct="UPDATE [dbo].[Products]\n" +
"   SET [product_name] = ?\n" +
"      ,[product_type] = ?\n" +
"      ,[description] = ?\n" +
"      ,[img] = ?\n" +
"      ,[price] = ?\n" +
"      ,[status] = ?\n" +
" WHERE product_id = ?";
     
     
      public static String updateStore="UPDATE [dbo].[Stores]\n" +
"   SET [store_name] = ?\n" +
"      ,[store_address] = ?\n" +
"      ,[city] = ?\n" +
"      ,[phone] = ?\n" +
" WHERE store_id=?";
     public static String addStore="INSERT INTO [dbo].[Stores]\n" +
"           ([store_name]\n" +
"           ,[store_address]\n" +
"           ,[city]\n" +
"           ,[phone])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
     
     public static String addOrders="INSERT INTO [dbo].[Orders]\n" +
"           ([customer_id]\n" +
"           ,[order_status]\n" +
"           ,[delivery_way]\n" +
"           ,[order_time]\n" +
"           ,[total_price]\n" +
"           ,[note]\n" +
"           ,[code])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,GETDATE()\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
     public static String deleteCustomerCart="DELETE FROM [dbo].[customerCart]\n" +
"      WHERE customer_id=? and productId=?";
     public static String UpdateCustomerCart="UPDATE [dbo].[customerCart]\n" +
"   SET  [Quantity] = ?\n" +
"      ,[price] = ?\n" +
" WHERE [customer_id] = ? and [productId] = ?";
     public static String addCustomerCart="INSERT INTO [dbo].[customerCart]\n" +
"           ([customer_id]\n" +
"           ,[productId]\n" +
"           ,[Quantity]\n" +
"           ,[price])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
     
     public static String addCategory="INSERT INTO [dbo].[Categories]\n" +
"           ([category_name]\n" +
"           ,[category_type])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?)";
     
      public static String updateCategory="UPDATE [dbo].[Categories]\n" +
"   SET [category_name] = ?\n" +
"      ,[category_type] = ?\n" +
" WHERE category_id = ?";
      
      public static String deleteCategory="DELETE FROM [dbo].[Categories]\n" +
"      WHERE category_id = ?";
      
      public static String addGuest="INSERT INTO [dbo].[Guest]\n" +
"           ([guest_name]\n" +
"           ,[email]\n" +
"           ,[phone]\n" +
"           ,[address]\n" +
"           ,[status]\n" +
"           ,[guestCode])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
      
      public static String addGuestOrder="INSERT INTO [dbo].[OrdersGuest]\n" +
"           ([guest_id]\n" +
"           ,[order_status]\n" +
"           ,[delivery_way]\n" +
"           ,[order_time]\n" +
"           ,[note]\n" +
"           ,[total_price])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
      
       public static String addGuestOrderDetails="INSERT INTO [dbo].[Guest_Order_details]\n" +
"           ([order_id]\n" +
"           ,[quantity]\n" +
"           ,[amount_price]\n" +
"           ,[productId])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
      
       
       public static String addOrderDetails="INSERT INTO [dbo].[Order_details]\n" +
"           ([order_id]\n" +
"           ,[quantity]\n" +
"           ,[amount_price]\n" +
"           ,[productId])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?)";
       
       public static String addOrderGuest="INSERT INTO [dbo].[OrdersGuest]\n" +
"           ([guest_id]\n" +
"           ,[order_status]\n" +
"           ,[delivery_way]\n" +
"           ,[order_time]\n" +
"           ,[note]\n" +
"           ,[total_price])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,GETDATE()\n" +
"           ,?\n" +
"           ,?)";
     public static String addProduct="INSERT INTO [dbo].[Products]\n" +
"           ([product_name]\n" +
"           ,[product_type]\n" +
"           ,[description]\n" +
"           ,[img]\n" +
             "           ,[status]\n" +
"           ,[price])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
             "           ,1\n" +
"           ,?)";
     
 public static String deleteProduct="DELETE FROM [dbo].[Products]\n" +
"   where  product_id= ?";
     
      public static String getOrderByDate="select order_id,customer_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,total_price ,note from orders where FORMAT (order_time, 'yyyy-MM')  = ? and order_status=2";
      public static String getOrderGuestByDate="select order_id,guest_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,total_price ,note from OrdersGuest where FORMAT (order_time, 'yyyy-MM')  = ? and order_status=2";
      
      public static String getAllOrder_detailsByOrdID="select *  from Order_details where order_id= ?";
      
      public static String getTotalInMonth="select sum(total_price) as total from orders where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), 'MM') and  order_status=2";
      public static String getTotalDaily="select sum(total_price) as total from orders where FORMAT (order_time, 'yyyy-MM-dd')  = FORMAT (GETDATE(), 'yyyy-MM-dd') and order_status=2";
     
        public static String getAllTotalInEachMonth="SELECT SUM(price_sum) as total_price FROM (\n" +
"    SELECT SUM(total_price) as price_sum FROM orders where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), ?) and  order_status=2\n" +
"    UNION ALL\n" +
"    SELECT SUM(total_price) as price_sum FROM OrdersGuest where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), ?) and  order_status=2\n" +
") as total";
     
      
      
       public static String getGuestTotalInMonth="select sum(total_price) as total from OrdersGuest where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), 'MM') and  order_status=2";
      public static String getGuestTotalDaily="select sum(total_price) as total from OrdersGuest where FORMAT (order_time, 'yyyy-MM-dd')= FORMAT (GETDATE(), 'yyyy-MM-dd') and order_status=2";
     
      
      
      
       public static String findStoreByName="select *from Stores where store_name like '%'?'%' or city like '%'?'%'";
     public static String findStoreByID="select *from Stores where store_id=?";
             
      public static String getAllGuest="select *from guest";
       public static String getGuestByEmail="select *from guest where guestCode=?";
     
   public static String getAllProcessOrder="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date from Guest a join OrdersGuest b on a.guest_id=b.guest_id where order_status <=1";
   public static String getAllCustomerProcessOrder="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date \n" +
"from Customers a join Orders b on a.customer_id=b.customer_id where order_status =0 or order_status =1";
   
    public static String getAllCustomerProcessOrderByID="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date\n" +
"from Customers a join Orders b on a.customer_id=b.customer_id where order_status =0 or order_status =1 and order_id=?";
   
   
   
   public static String getAllSuccessOrder="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date from Guest a join OrdersGuest b on a.guest_id=b.guest_id where order_status >=2";
   public static String getAllCustomerSuccessOrder="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date \n" +
"from Customers a join Orders b \n" +
"on a.customer_id=b.customer_id where order_status >=2";
   
    public static String getAllCustomerSuccessOrderByID="select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date \n" +
"from Customers a join Orders b \n" +
"on a.customer_id=b.customer_id where order_status >=2 and order_id=? or email like '%?%'";
   
   public static String getAllProduct="select *from Products ";
   public static String getAllProductWorking="select *from Products where status=1";
     public static String findProductByNameOrType="select *from Products where product_name like '%?%' ";
      public static String getAllStore="select *from Stores";
      public static String getAllCategory="select *from Categories";
       public static String getAllCategoryByID="select *from Categories where category_id= ?";
      public static String getAllorderGuestDetails="select *from Guest_Order_details";
       public static String getAllorders="select order_id,customer_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,total_price,note from orders";
  public static String getAllSuccessorders="select order_id,customer_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,total_price,note from orders where order_status=2";
  
       public static String getOrdersByCode="select order_id,customer_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,total_price,note from orders where code = ?";
       
       public static String getAllordersGuest="select order_id,guest_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,note,total_price from OrdersGuest";
    public static String getAllSuccessordersGuest="select order_id,guest_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,note,total_price from OrdersGuest where order_status=2";
    
       public static String getOrdersGuestByID="select order_id,guest_id,order_status,delivery_way,FORMAT (order_time, 'dd-MM-yyyy') as order_time,note,total_price from OrdersGuest where guest_id =?";
        public static String getOrdersDetailsGuestByOrderID="select *from Guest_Order_details where order_id= ?";
    
    public static String getProductByType="select *from Products where product_type= ? and status=1";
     
       public static String getProductByID="select *from Products where product_id= ?";
  
public static String getAccountByUsername="select * from Customers where (username = ? or email = ?)";
public static String getEmployeeByUsername="select * from Employees where (username = ? or email = ?)";


public static String checkAccountExistWhenForgot="select * from Customers where username = ? and email = ?";
  

  public static String checkAccount="select * from Customers where (username = ? or email = ?) and password = ?";
  public static String checkAccountExist="select * from Customers where (username = ? or email = ?)";
  
   public static String checkAccountEmployee=" select *from Employees where email=?";
   public static String checkEmployee="select * from Employees where (username = ? or email = ?) and password = ?";
    
public static String LoginEmployee="select * from Employees where (username = ? or email = ?) and password = ?";
public static String LoginCustomer="select * from Customers where (username = ? or email = ?) and password = ?";



public static String getCustomerByID="select *from Customers where customer_id = ?";
public static String getAllCustomer="select *from Customers ";
public static String getAllEmployee="select *from Employees where role = ? or role=1 or role =2";

public static String updateCustomerPassword="UPDATE [dbo].[Customers]\n" +
"   SET \n" +
"   [password] = ?\n" +
" WHERE customer_id = ?";
public static String RegisterCustomer="INSERT INTO [dbo].[Customers] ([username],[password],[email],[status])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"          , ?)";


public static String UpdateEmployee="UPDATE [dbo].[Employees]\n" +
"   SET [email] = ?,[username] = ?,[password] = ?,[store_id] = ?,[employee_name] = ?,[phone] = ?,[personal_id] = ?,[dob] = ?,[started_date] = ?,[role] = ?,[status] = ?\n" +
" WHERE employee_id =?";
public static String RegisterEmployee="INSERT INTO [dbo].[Employees]\n" +
"           ([email]\n" +
"           ,[username]\n" +
"           ,[password]\n" +
"           ,[store_id]\n" +
"           ,[employee_name]\n" +
"           ,[started_date]\n" +
"           ,[role]\n" +
"           ,[status])\n" +
"     VALUES\n" +
"           (?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,?\n" +
"           ,CAST( GETDATE() AS Date)\n" +
"           ,?\n" +
"           ,?)";



public static String getDetailsOrderGuest="select a.order_id,c.product_name,a.note,b.quantity,c.price as amount_price, (b.amount_price * b.quantity) as Total\n" +
"from OrdersGuest a  join Guest_Order_details b on a.order_id=b.order_id\n" +
"                           join Products c on b.productId=c.product_id join Guest d on a.guest_id=d.guest_id\n" +
"						where a.order_id= ?";


public static String getDetailsOrderCustomer="select a.order_id,c.product_name,a.note,b.quantity,c.price as amount_price, b.amount_price as Total\n" +
"from Orders a  join Order_details b on a.order_id=b.order_id \n" +
"                           join Products c on b.productId=c.product_id join Customers d on a.customer_id=d.customer_id \n" +
"							where a.order_id= ?";

public static String getDetailsOrderCustomerStatus="select a.order_id,c.product_name,a.note,b.quantity,b.amount_price, (b.quantity*b.amount_price) as Total \n" +
"from Orders a  join Order_details b on a.order_id=b.order_id\n" +
"                           join Products c on b.productId=c.product_id join Customers d on a.customer_id=d.customer_id\n" +
"							where d.customer_id= ? ";


public static String updateOrderStatus="UPDATE [dbo].[OrdersGuest]\n" +
"   SET [order_status] = ?\n" +
" WHERE order_id=?";
public static String updateOrderStatusForCustomer="UPDATE [dbo].[Orders]\n" +
"   SET [order_status] = ?\n" +
" WHERE order_id=?";


public static String deleteOrderDetails="DELETE FROM [dbo].[OrdersGuest]\n" +
"      WHERE order_id=?";


}
