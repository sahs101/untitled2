


    public class uman {
        private static int count = 0;
        private String name;
        private int age;

        public uman(String Name, int Age) {
            count += 1;
            this.name = Name;
            this.age = Age;
        }

        public String getNameAge() {
            return name + " " + age;
        }

        public void swapName(String newName) {
            this.name = newName;
        }

        public String printNameAge() {
            System.out.println(getNameAge());
            return null;

        }

        public void swapAge(int newAge) {
            this.age = newAge;



        }

        static int getCount(){
            System.out.println(count);
            return 0;
        }
    }