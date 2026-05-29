package JavaByCoderArmy;

public class BuilderDemo {
    public static void main(String[] args) {
        // Creating a computer with only required fields + some optionals
        Computer gamingPC = new Computer.Builder("Intel i9", 32)
                .storage(1000)
                .gpu("NVIDIA RTX 4090")
                .os("Windows 11")
                .build();

        System.out.println(gamingPC);

        // Minimal configuration
        Computer basicPC = new Computer.Builder("AMD Ryzen 5", 16)
                .build();

        System.out.println(basicPC);
    }
}

// Product class (immutable)
class Computer {
    private final String cpu;      // required
    private final int ram;         // required
    private final int storage;     // optional
    private final String gpu;      // optional
    private final String os;       // optional

    // Private constructor - only accessible via Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Getters
    public String getCpu() { return cpu; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public String getGpu() { return gpu; }
    public String getOs() { return os; }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", GPU='" + gpu + '\'' +
                ", OS='" + os + '\'' +
                '}';
    }

    // Static Builder class
    public static class Builder {
        // Required fields
        private final String cpu;
        private final int ram;

        // Optional fields with default values
        private int storage = 0;
        private String gpu = "Integrated";
        private String os = "Windows";

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Fluent setter methods (return this for chaining)
        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        // Build method that creates the final object
        public Computer build() {
            // Optional: Add validation here
            if (ram < 4) {
                throw new IllegalArgumentException("RAM must be at least 4GB");
            }
            return new Computer(this);
        }
    }
}