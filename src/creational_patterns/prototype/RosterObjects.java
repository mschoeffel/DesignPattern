package creational_patterns.prototype;

public abstract class RosterObjects implements Cloneable {
    private String objectName;
    private float duration;

    public String getObjectName() {
        return objectName;
    }

    protected void setObjectName(String name) {
        objectName = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public abstract RosterObjects cloneRoster();
}
