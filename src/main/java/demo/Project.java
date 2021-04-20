package demo;

import java.util.List;

public class Project {
    private List versions;//raw-typed

    @SuppressWarnings({"unchecked", "deprecated"})
    public void addVersion(String version){
        versions.add(version);
    }
}
