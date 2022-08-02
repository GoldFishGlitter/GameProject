package model;

public abstract class StartingClass {
    private String name;

    public StartingClass() {

    }

    public StartingClass(final String name) {

        System.out.println("Initializing constructor.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Can't set empty name");
        }
        this.name = name;
    }
}
