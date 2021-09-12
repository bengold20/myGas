package ben.study.gas.service;

import ben.study.gas.entity.Store;
import ben.study.gas.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Store createStore(Store store) {
       return storeRepository.save(store);
    }


    public String deleteAllStore(Store store) {
        storeRepository.deleteAll();
        return "remove stores. finish!!";
    }

    public List<Store> selectAllStore() {
        return storeRepository.findAll();
    }

    public List<Store> createStores(List<Store> stores) {
        return storeRepository.saveAll(stores);
    }

    public List<Store> selectStoreByName(String name_store) {
       return storeRepository.findStoreByName(name_store);
    }
}
