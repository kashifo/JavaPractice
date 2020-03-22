package design_patterns.builder;

class BuilderDemo {

    public static void main(String[] args) {

        User user = new User.Builder()
                .setFirstName("Kashif")
                .setLastName("Anwaar")
                .setAge(25)
                .create();

        System.out.println( user );

    }

}
