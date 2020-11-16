package step3;

import step3.domain.LottoGeneratorStrategy;

import java.util.Arrays;
import java.util.List;

public class OneToSixLottoMakeStrategy implements LottoGeneratorStrategy {



    @Override
    public List<Integer> generateLottoNumbers() {
        return Arrays.asList(1,2,3,4,5,6);
    }
}
