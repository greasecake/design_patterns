package structural.composite;

public class Main {
    public static void main(String[] args) {
        Directory musicDirectory = new Directory("Music");
        Directory documentsDirectory = new Directory("Documents");

        FileSystemComponent rockMusic = new File("Rock", 50);
        FileSystemComponent popMusic = new File("Pop", 30);
        FileSystemComponent resume = new File("Resume", 5);
        FileSystemComponent projectReport = new File("Project Report", 10);

        musicDirectory.addComponent(rockMusic);
        musicDirectory.addComponent(popMusic);
        documentsDirectory.addComponent(resume);
        documentsDirectory.addComponent(projectReport);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(musicDirectory);
        rootDirectory.addComponent(documentsDirectory);

        rootDirectory.showDetails();
    }
}
