public class FirstSuperProvidor implements Provider {
    @Override
    public Super newSuper() {
        return new FirstSuper();
    }
}
