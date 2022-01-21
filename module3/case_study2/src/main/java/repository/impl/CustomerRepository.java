package repository.impl;

import model.Customer;
import repository.ICustomerRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepository implements ICustomerRepository {
    private static String Select_All_Customer = "select * from khach_hang";
    private static String Select_Customer_By_Id = "select * from khach_hang where ma_khach_hang=?";
    private static String Insert_Customer = "insert into khach_hang values ma_khach_hang=?,ma_loai_khach=?,ho_ten=?,ngay_sinh=?,gioi_tinh=?,so_cmnd=?,so_dien_thoai=?,email=?,dia_chi=?";
    private static String Update_Customer = "update khach_hang set ma_loai_khach=?,ho_ten=?,ngay_sinh=?,gioi_tinh=?,so_cmnd=?,so_dien_thoai=?,email=?,dia_chi=? where ma_khach_hang=?";
    private static String Delete_Customer = "delete from khach_hang where ma_khach_hang=?";
    DataBaseRepository dbRepository = new DataBaseRepository();
    private Connection connection=dbRepository.getAConnect();
    public static int customerAmount=0;

    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Select_All_Customer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ma_khach_hang");
                int typeId = rs.getInt("ma_loai_khach");
                String name = rs.getString("ho_ten");
                String birth = rs.getString("ngay_sinh");
                int gender = rs.getInt("gioi_tinh");
                String idCard = rs.getString("so_cmnd");
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                Customer customer = new Customer(id,typeId,name,birth,gender,idCard,phone,email,address);
                customerList.add(customer);
                customerAmount++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void insertCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Insert_Customer);
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setInt(2, customer.getTypeId());
            preparedStatement.setString(3, customer.getName());
            preparedStatement.setString(4, customer.getBirthday());
            preparedStatement.setInt(5, customer.getGender());
            preparedStatement.setString(6, customer.getIdCard());
            preparedStatement.setString(7, customer.getPhone());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getAddress());
            //  ResultSet rs=preparedStatement.executeQuery();
            preparedStatement.executeUpdate();
            customerAmount++;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Update_Customer);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setInt(2, customer.getTypeId());
            preparedStatement.setString(3, customer.getName());
            preparedStatement.setString(4, customer.getBirthday());
            preparedStatement.setInt(5, customer.getGender());
            preparedStatement.setString(6, customer.getIdCard());
            preparedStatement.setString(7, customer.getPhone());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getAddress());
            preparedStatement.setInt(1,customer.getId());
            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        boolean rowDelete=false;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(Delete_Customer);
            preparedStatement.setInt(1,customer.getId());
            rowDelete=preparedStatement.executeUpdate()>0;
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public Customer selectCustomerById(int id) {
        Customer customer=null;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(Select_Customer_By_Id);
            preparedStatement.setInt(1,id);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next())
            {
                int typeId = rs.getInt("ma_loai_khach");
                String name = rs.getString("ho_ten");
                String birth = rs.getString("ngay_sinh");
                int gender = rs.getInt("gioi_tinh");
                String idCard = rs.getString("so_cmnd");
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                customer = new Customer(id, typeId, name, birth, gender, idCard, phone, email, address);
            }
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return customer;
    }
}