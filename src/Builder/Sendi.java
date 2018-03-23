package Builder;

public class Sendi {
    //defining the fields, when the builder will set some of them
    private final int weight;
    private final int height;
    private final int age;
    private final int quteness;

    public static class Builder{
        private final int height;
        private final int weight;
        private final int quteness = 100;

        public Builder(int height, int weight){
            this.height = height;
            this.weight = weight;
        }
        private int age = 0;

        public Builder age(int ageToSet){
            this.age = ageToSet;
            return this;
        }

        public Sendi buildSendi(){
            return new Sendi(this);
        }

    }

    /**
     * with a private constructor, we initialize new instance via builder
     * @param b
     */
    private Sendi(Builder b){
        this.age = b.age;
        this.height = b.height;
        this.quteness = b.quteness;
        this.weight = b.weight;
    }
}
