package com.epam.jira.entity;

public enum TestResult {

    FAILED("Failed"),
    PASSED("Passed"),
    BLOCKED("Blocked"),
    UNTESTED("Untested");

    private final String text;

    TestResult(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
