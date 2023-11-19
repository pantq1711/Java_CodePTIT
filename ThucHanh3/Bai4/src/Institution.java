class Institution {
    private String ID, name;

    public Institution(String line) {
        String[] words = line.trim().split("\\s+");
        ID = words[0];
        name = "";
        for (int i = 1; i < words.length; ++i) {
            name += words[i] + " ";
        }
        name =  name.trim();
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
