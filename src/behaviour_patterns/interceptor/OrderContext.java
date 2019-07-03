package behaviour_patterns.interceptor;

import java.time.LocalDate;

public class OrderContext {

    private String orderData;
    private LocalDate dateTimeStamp;
    private boolean isEncrypted;

    public OrderContext(String orderData, LocalDate dateTimeStamp, boolean isEncrypted) {
        this.orderData = orderData;
        this.dateTimeStamp = dateTimeStamp;
        this.isEncrypted = isEncrypted;
    }

    public String getOrderData() {
        return orderData;
    }

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    public LocalDate getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(LocalDate dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public boolean isDecrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }
}
