package structural_patterns.wrapper;

import java.util.Date;

public abstract class Contract {

    private Date contractBegin;
    private Date contractEnd;
    private boolean released = false;

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public Date getContractBegin() {
        return contractBegin;
    }

    public void setContractBegin(Date contractBegin) {
        this.contractBegin = contractBegin;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public abstract void release();
    public abstract void cancel(Date cancelDate);
}
