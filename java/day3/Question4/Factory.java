public class Factory {

    public static Cycle getCycle(String type) {
        if ("Unicycle".equalsIgnoreCase(type)) return new Unicycle();
        else if ("Bicycle".equalsIgnoreCase(type)) return new Bicycle();
        else if ("Tricycle".equalsIgnoreCase(type)) return new Tricycle();

        return null;
    }
}
