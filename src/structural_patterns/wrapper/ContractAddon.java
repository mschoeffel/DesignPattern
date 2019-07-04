package structural_patterns.wrapper;

import java.util.Date;

public abstract class ContractAddon extends Contract {

    private Contract contract;

    public ContractAddon(Contract contract){
        this.contract = contract;
    }

    public Contract getContract(){
        return contract;
    }

    @Override
    public void release(){
        contract.release();
    }

    @Override
    public void cancel(Date cancelDate){
        contract.cancel(cancelDate);
    }
}
