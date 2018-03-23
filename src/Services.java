import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services(){} //private constructor
    private static final Map<String,Provider> allProviders = new ConcurrentHashMap<>(); //all the providers in the service
    public static final String defaultProvider = "def";

    //methods to add providers and to get a service of some provider
    public static void registerDefProvider(Provider p){
        registerProvider(defaultProvider, p);
    }

    public static void registerProvider(String name, Provider p){
        allProviders.put(name,p);
    }

    public static Super getSuperService(String name){
        Provider p = allProviders.get(name);
        if (p!=null){
            return p.newSuper();
        }
        return null;
    }
}
