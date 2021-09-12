package ben.study.gas.controller;

import ben.study.gas.entity.Gas;
import ben.study.gas.service.GasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GasController {

    @Autowired
    private GasService gasService;

    @PostMapping("/gas")
    public Gas addGas(@RequestBody Gas gas) {
        return gasService.createGas(gas);
    }

    @PostMapping("/gases")
    public List<Gas> addGases(@RequestBody List<Gas> gases){
        return gasService.addGases(gases);
    }

    @GetMapping("/gases")
    public List<Gas> selectAllGas(){
        return gasService.selectAllGas();
    }

    @GetMapping("/gases-store")
    public List<String> selectGasInStoreByName(@RequestParam String name_store){
        return gasService.selectGasInStoreByName(name_store);
    }

    @DeleteMapping("/gases")
    public String deleteAllBill(@RequestBody Gas gas){
        return gasService.deleteAllBill(gas);
    }
}
