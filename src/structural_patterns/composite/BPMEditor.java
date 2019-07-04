package structural_patterns.composite;

public class BPMEditor {
    public void start() {
        BPMSequence storageInput = new BPMSequence(1);

        BPMComponent output = new BPMConsoleOutput(2, "New delivery arrived");
        storageInput.add(output);

        BPMSequence checkDelivery = new BPMSequence(3);
        BPMComponent informLaboratory = new BPMConsoleOutput(4, "Please check");
        checkDelivery.add(informLaboratory);
        storageInput.add(checkDelivery);

        storageInput.start();
    }
}
