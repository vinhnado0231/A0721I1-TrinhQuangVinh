package Service;

import Model.MatBang;

import java.util.List;

public interface IMatBangService {
    List<MatBang> getList();
    void create(MatBang matBang);
    void update(MatBang matBang);
    void delete(MatBang matBang);
    MatBang selectByID(int id);
}
