package BuilderPattern;

public class Clothes {

    private String hat;
    private String top; // 필수 선택
    private String bottom; // 필수 선택
    private String shoes; // 필수 선택
    private String socks;
    private String glasses;
    private String bag;

    public static class Builder {
        private String top;
        private String bottom;
        private String shoes;

        private String hat;
        private String socks;
        private String glasses;
        private String bag;

        public Builder(String top, String bottom, String shoes) {
            this.top = top;
            this.bottom = bottom;
            this.shoes = shoes;
        }

        public Builder hat(String hat) {
            this.hat = hat;
            return this;
        }

        public Builder socks(String socks) {
            this.socks = socks;
            return this;
        }

        public Builder glasses(String glasses) {
            this.glasses = glasses;
            return this;
        }

        public Builder bag(String bag) {
            this.bag = bag;
            return this;
        }

        public Clothes build() {
            return new Clothes(this);
        }
    }

    private Clothes(Builder builder) {
        this.top = builder.top;
        this.bottom = builder.bottom;
        this.shoes = builder.shoes;
        this.hat = builder.hat;
        this.glasses = builder.glasses;
        this.socks = builder.socks;
        this.bag = builder.bag;
    }

    public String toString() {
        return this.top + "\n" + this.bottom + "\n" + this.shoes + "\n" + this.hat + "\n" + this.glasses + "\n"
                + this.socks + "\n" + this.bag;
    }
}