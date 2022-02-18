package Service.impl;

import Model.MatBang;
import Repository.impl.MatBangRepository;
import Service.IMatBangService;

import java.util.List;

public class MatBangService implements IMatBangService {
    private MatBangRepository matBangRepository = new MatBangRepository();

    @Override
    public List<MatBang> getList() {
        List<MatBang> matBangList = matBangRepository.getList();
        return matBangList;
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
