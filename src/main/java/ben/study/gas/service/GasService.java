package ben.study.gas.service;

import ben.study.gas.entity.Gas;
import ben.study.gas.repository.GasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasService {

    @Autowired
    private GasRepository gasRepository;


    public Gas createGas(Gas gas) {
       return gasRepository.save(gas);
    }

    public String deleteAllBill(Gas gas) {
        gasRepository.deleteAll();
        return "remove gas done!!!";
    }

    public List<Gas> addGases(List<Gas> gases) {
        return gasRepository.saveAll(gases);
    }

    public List<Gas> selectAllGas() {
       return gasRepository.findAll();
    }

    public List<String> selectGasInStoreByName(String name_store) {
        return gasRepository.selectGasInStoreByName(name_store);
    }
}
