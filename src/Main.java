public class Main {
    public static void main(String[] args){
        Services.registerDefProvider(new FirstSuperProvidor());
        Services.registerProvider("Second",new SecondSuperProvider());
        Super s = Services.getSuperService("Second");
        if (s!=null){
            s.doIt();
        }



    }
}
