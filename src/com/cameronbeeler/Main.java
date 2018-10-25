package com.cameronbeeler;

public class Main {

    public static void main(String[] args)
    {
        PolitePerson jane = new PolitePerson("Jane");
        PolitePerson cam = new PolitePerson("Cam");

        jane.sayHello(cam);
        cam.sayHello(jane);
    }

    static class PolitePerson
    {
        private final String name;

        public
        PolitePerson(String name)
        {
            this.name = name;
        }

        public
        String getName()
        {
            return name;
        }

        public synchronized
        void sayHello(PolitePerson person)
        {
            System.out.format("%s: %s" + " Has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized

        void sayHelloBack(PolitePerson person)
        {
            System.out.format("%s: %s" + " Has said hello back ot me!%n", this.name, person.getName());
        }
    }
}
