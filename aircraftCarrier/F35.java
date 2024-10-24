package aircraftCarrier;

public class F35 extends Aircraft {
    public F35() {
        super(12, 50);
    }

    @Override
    public String getType() {
        return "F35";
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}
