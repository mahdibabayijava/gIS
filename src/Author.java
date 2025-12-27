public class Author {
    //--------------------------Fields-------------------------
    private String authorId;
    private String authorFullName;

    //-----------------------Constructors----------------------
    //-------------------------Setters-------------------------
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setAuthorFullName(String authorFullName) {
        if (authorFullName.contains("0") || authorFullName.contains("1")
                || authorFullName.contains("2") || authorFullName.contains("3")
                || authorFullName.contains("4") || authorFullName.contains("5")
                || authorFullName.contains("6") || authorFullName.contains("7")
                || authorFullName.contains("8") || authorFullName.contains("9")) {
            throw new IllegalArgumentException();
        }
        this.authorFullName = authorFullName;
    }


    //-------------------------Getters-------------------------
    public String getAuthorId() {
        return authorId;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }


    //-------------------------Methods-------------------------
}
