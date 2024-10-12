package org.knit.lab2.task5;

public class File extends FileSystemComponent {
    private final int size;
    public File(String name,int size){
        super(name);
        this.size = size;
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public void display(String ident){
        System.out.println(ident + name + " " + size);
    }
}
