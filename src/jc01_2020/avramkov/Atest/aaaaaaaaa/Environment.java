package jc01_2020.avramkov.Atest.aaaaaaaaa;

public enum Environment {
    PROD("https://release.application.com/"),
    TEST("https://test.application.com/"),
    AUTO_TEST("https://autotest.application.com/"),
    DEV("http://localhost:8080");

    private final String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
