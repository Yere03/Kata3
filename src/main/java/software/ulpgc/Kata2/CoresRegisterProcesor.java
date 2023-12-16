package software.ulpgc.Kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoresRegisterProcesor implements RegisterProcesor {
    @Override
    public Map<Integer, Integer> process(List<Register> registers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Register register: registers){
            int Cores = register.getCores();
            if(Cores == -1) continue;
            result.put(Cores,result.getOrDefault(Cores,0)+1);
        }
        return result;
    }
}
