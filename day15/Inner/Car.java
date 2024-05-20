package day15.Inner;

public class Car {
    String name;
    int age;
    Engine e;


    private class Engine {
        String engineName;
        int engineAge=2;

        public int getEngineAge() {
            return engineAge;
        }
    }

    public Engine getEngine() {
        return new Engine();
    }
}
