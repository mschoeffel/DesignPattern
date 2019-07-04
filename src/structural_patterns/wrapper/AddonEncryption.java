package structural_patterns.wrapper;

public class AddonEncryption extends ContractAddon {

    public AddonEncryption(Contract contract) {
        super(contract);
    }

    public void encrypt(){
        //Do encryption magic
    }
}
