package verhaltensmuster.interceptor;

import java.time.LocalDate;

public class BestellContext {

    private String bestelldaten;
    private LocalDate dateTimeStamp;
    private boolean isVerschluesselt;

    public BestellContext(String bestelldaten, LocalDate dateTimeStamp, boolean isVerschluesselt) {
        this.bestelldaten = bestelldaten;
        this.dateTimeStamp = dateTimeStamp;
        this.isVerschluesselt = isVerschluesselt;
    }

    public String getBestelldaten() {
        return bestelldaten;
    }

    public void setBestelldaten(String bestelldaten) {
        this.bestelldaten = bestelldaten;
    }

    public LocalDate getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(LocalDate dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public boolean isVerschluesselt() {
        return isVerschluesselt;
    }

    public void setVerschluesselt(boolean verschluesselt) {
        isVerschluesselt = verschluesselt;
    }
}
