package Repository.impl;

import Model.MatBang;
import Repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatBangRepository implements IMatBangRepository {
    private static String Select_All = "select * from mat_bang";

    private static int amount = 0;
    DataBaseRepository dbRepository = new DataBaseRepository();
    private Connection connection=dbRepository.getAConnect();

    @Override
    public List<MatBang> getList() {
        List<MatBang> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Select_All);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id= rs.getString("ma_mat_bang");
                int statusCheck=rs.getInt("ma_trang_thai");
                String status="";
                if(statusCheck==1){
                    status="Trống";
                }else if(statusCheck==2){
                    status="Hạ tầng";
                }else if(statusCheck==3){
                    status="Đầy đủ";
                }
                double area=rs.getDouble("dien_tich");
                int floor=rs.getInt("tang");
                int typeCheck=rs.getInt("ma_loai_mat_bang");
                String type="";
                if(typeCheck==1){
                    type="Văn phòng chia sẻ";
                }else if(typeCheck==2){
                    type="Văn phòng trọn gói";
                }
                double  price=rs.getDouble("gia");
                String dateStart=rs.getString("ngay_bat_dau");
                String dateEnd=rs.getString("ngay_ket_thuc");;
                MatBang matBang =new MatBang(id,status,area, floor,type,price, dateStart,dateEnd);
                list.add(matBang);
                amount++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;

    }

    @Override
    public void create(MatBang matBang) {

    }

    @Override
    public void update(MatBang matBang) {

    }

    @Override
    public void delete(MatBang matBang) {

    }

    @Override
    public MatBang selectByID(int id) {
        return null;
    }
}
