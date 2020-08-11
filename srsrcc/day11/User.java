package day11;


    public class User {
        final String USERNAME;
        private int age;

        public String getUSERNAME() {
            return USERNAME;
        }

        public User(String USERNAME) {
            this.USERNAME = USERNAME;
        }

        public User(String username, int age) {
            this.USERNAME = username;
            this.age = age;
        }
    }
