package Repository;

import Model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> getList();
    void create(MatBang matBang);
    void update(MatBang matBang);
    void delete(MatBang matBang);
    MatBang selectByID(int id);
}
