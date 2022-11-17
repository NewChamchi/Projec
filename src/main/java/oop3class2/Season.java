package oop3class2;

public enum Season {
    SPRING("3-5월"),
    SUMMER("6-8월"),
    FALL("9-11월"),
    WINTER("12-2월");

    private String span;
    Season(String span) { this.span = span;}

    public String getSpan() { return span; }
}
