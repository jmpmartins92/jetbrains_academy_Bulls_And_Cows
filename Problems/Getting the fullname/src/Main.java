class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (this.lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (getFirstName() == null && getLastName() == null) {
            return "Unknown";
        } else if (getLastName() == null) {
            return getFirstName();
        } else if (getFirstName() == null) {
            return  getLastName();
        } else {
            return getFirstName() + " " + getLastName();
        }

        // write your code here
    }
}