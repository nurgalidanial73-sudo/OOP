class Candidate {
    private String name;
    private int id;

    public Candidate(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean hasSameId(Candidate other) {
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Candidate{name='" + name + "', id=" + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Candidate) {
            Candidate c = (Candidate) o;
            return id == c.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}