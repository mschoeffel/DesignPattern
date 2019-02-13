package strukturmuster.dekorierer;

import java.util.Date;

public abstract class Vertrag {

    private Date vertragsbeginn;
    private Date vertragsende;
    private boolean freigegeben = false;

    public boolean isFreigegeben() {
        return freigegeben;
    }

    public void setFreigegeben(boolean freigegeben) {
        this.freigegeben = freigegeben;
    }

    public Date getVertragsbeginn() {
        return vertragsbeginn;
    }

    public void setVertragsbeginn(Date vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    public Date getVertragsende() {
        return vertragsende;
    }

    public void setVertragsende(Date vertragsende) {
        this.vertragsende = vertragsende;
    }

    public abstract void freigeben();
    public abstract void kuendigen(Date kuendigenDatum);
}
