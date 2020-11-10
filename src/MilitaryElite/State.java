package MilitaryElite;

public enum State {
    INPROGGRESS("inProgress"),
    FINISHED("finished");

    private String state;

    private State(String state) {
        this.state = state;
    }
}
