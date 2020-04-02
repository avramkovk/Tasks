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

    public static Department getDepartment(Department department) {
        /*тут можно что-нибудь написать*/

        if (department == A1) return Department.valueOf(A1.value);
        if (department == A2) return Department.valueOf(A2.value);
        if (department == A3) return Department.valueOf(A3.value);
        return null;
    }

}
