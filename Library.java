package library;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Branch> branches;
    
    public Library(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
    //other methods
    public void addBranch(Branch branch) {
        branches.add(branch);
    }
    
    public void removeBranch(Branch branch) {
        branches.remove(branch);
    }
    //toString method
    @Override
    public String toString(){
        return "Library name: "+name;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
