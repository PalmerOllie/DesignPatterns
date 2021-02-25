package designPatterns.structural.adapterExample;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        instance = employeeLdap;
    }

    @Override
    public String getId() {
        return instance.getCn(); //CN is the same as the id in LDAP
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
