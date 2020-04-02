package jc01_2020.avramkov.test02;

public enum  Department {

    A1("Кухня"),
    A2("Рентген кабинет"),
    A3("МАЗ");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Department getDepartment(String department) {
        /*тут можно что-нибудь написать*/
        for (Department dep: values()){
            if(dep.getValue().equals(department)){
                return dep;
            }
        }
        return null;
    }
}
