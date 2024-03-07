package interfacee;

class Kennel {
    String Welcome(String s) {
        return s;
    }
    void Welcome() {
        System.out.println("Welcome to the india's largesrt kennel");
    }


    interface Bread {
        void bread_name();

        void Dog_color();
    }

    interface Owner_info {
        void owner_name();

        void owner_contact();
    }

static class Kenneldata extends interfacee.Kennel implements Bread, Owner_info {
        @Override
        public void bread_name() {
            System.out.println("German shepard");
        }

        @Override
        public void Dog_color() {
            System.out.println("Brown and Black");
        }

        @Override
        public void owner_name() {
            System.out.println("Mr.ravi");
        }

        @Override
        public void owner_contact() {
            System.out.println("9920202020202");
        }
    }
}
