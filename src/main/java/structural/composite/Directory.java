package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name + " of size: " + getSize() + " MB");
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
