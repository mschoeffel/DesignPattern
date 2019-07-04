package structural_patterns.wrapper;

public class AddonFiling extends ContractAddon {

    public AddonFiling(Contract contract) {
        super(contract);
    }

    public void archive(){
        //Do filing
    }
}
