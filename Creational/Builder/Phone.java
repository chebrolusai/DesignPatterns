public class Phone {

    private String os;
    private int storage;
    private boolean is120Hertz;
    private String color;
    private boolean isCoverageIncluded;

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", storage=" + storage +
                ", is120Hertz=" + is120Hertz +
                ", color='" + color + '\'' +
                ", isCoverageIncluded=" + isCoverageIncluded +
                '}';
    }

    private Phone(PhoneBuilder pb) {
        this.os = pb.os;
        this.color = pb.color;
        this.is120Hertz = pb.is120Hertz;
        this.isCoverageIncluded = pb.isCoverageIncluded;
        this.storage = pb.storage;
    }
    
    // The builder class
    public static class PhoneBuilder {
        private String os;
        private int storage = 128;
        private boolean is120Hertz = true;
        private String color = "Black";
        private boolean isCoverageIncluded = false;
        
        public PhoneBuilder(String os) {
            this.os = os;
        }

        PhoneBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        PhoneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        PhoneBuilder set120Hertz(Boolean flag) {
            this.is120Hertz = flag;
            return this;
        }

        PhoneBuilder setCoverageEnabled(Boolean flag) {
            this.isCoverageIncluded = flag;
            return this;
        }

        Phone Build() {
            return new Phone(this);
        }

    }
    
    public static void main(String[] args) {
        // Build a phone
        PhoneBuilder pb1 = new PhoneBuilder("IOS");
        Phone p1 = pb1.setColor("White").Build();

        System.out.println(p1);

        // Build another phone
        PhoneBuilder pb2 = new PhoneBuilder("IOS");
        Phone p2 = pb2.set120Hertz(false).setCoverageEnabled(true).setStorage(256).Build();

        System.out.println(p2);

    }
}
