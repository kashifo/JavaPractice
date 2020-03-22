package design_patterns.builder;

class User {
    private String firstName;
    private String lastName;
    private int age;

    private User(final Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User createSimple(){
            return new User(this);
        }

        public User create() {
            if (firstName==null || firstName.isEmpty()) {
                throw new IllegalStateException(
                        "First name can not be empty!");
            }

            return new User(this);
        }
    }

}
