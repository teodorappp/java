package isp.lab7.safehome;

import java.util.Objects;

public class Tenant {
    private String name;

    public Tenant(String name) {

        this.name = name;
    }

    public String getname()  {
        return name;
    }

    @Override
    public boolean equals(Object o) {
return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
