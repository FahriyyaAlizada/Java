package dec25;

public class MainClass {

	public static void main(String[] args) {
		
		Collection<String> stringCollection = new Collection<>();
		
		stringCollection.addElement("Happy");
        stringCollection.addElement("New");
        stringCollection.addElement("Year!");

        System.out.println("String Collection:");
        stringCollection.printElement();
        System.out.println("Size: " + stringCollection.size());

        System.out.println();
        
        Collection<Integer> integerCollection = new Collection<>();
		
        integerCollection.addElement(25);
        integerCollection.addElement(30);
        integerCollection.addElement(35);
        integerCollection.addElement(40);
        integerCollection.addElement(45);

        System.out.println("Integer Collection:");
        integerCollection.printElement();
        System.out.println("Size: " + integerCollection.size());

        System.out.println();
        
        Collection<Person> personCollection = new Collection<>();
		
        personCollection.addElement(new Person("Jennifer", 32));
        personCollection.addElement(new Person("Brad", 19));
        personCollection.addElement(new Person("James", 26));
        personCollection.addElement(new Person("Carol", 28));

        System.out.println("Person Collection:");
        personCollection.printElement();
        System.out.println("Size: " + personCollection.size());

	}

}
