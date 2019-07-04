package structural_patterns.wrapper;

import java.util.Date;

public class BuyContract extends Contract {
    @Override
    public void release() {
        setReleased(isValid());
    }

    @Override
    public void cancel(Date cancelDate) {
        if(cancelDate.after(getContractBegin())){
            setContractEnd(cancelDate);
        }
    }

    private boolean isValid(){
        //Check
        return true;
    }
}
