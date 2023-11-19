class Registration implements Comparable<Registration> {
    private String ID, nameINS, nameDoi;
    private int quantity;
    private static int cnt = 1;

    public Registration(String line) {
        String[] words = line.split("\\s+");
        ID = words[0];
        quantity = Integer.parseInt(words[1]);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNameDoi(String n) {
        this.nameDoi = n;
    }

    public void setNameINS(String n) {
        this.nameINS = n;
    }

    public String getID() {
        return ID;
    }

    @Override
    public int compareTo(Registration o) {
        if (this.nameINS.equals(o.nameINS)) return this.nameDoi.compareTo(o.nameDoi);
        return this.nameINS.compareTo(o.nameINS);
    }

    @Override
    public String toString() {
        return String.format("team%02d %s %s", cnt++, nameDoi, nameINS);
    }
}
