public class SecondSuperProvider implements Provider {
    @Override
    public Super newSuper() {
        return new SecondSuper();
    }
}
