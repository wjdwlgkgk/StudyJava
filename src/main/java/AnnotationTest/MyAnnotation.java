package AnnotationTest;

public @interface MyAnnotation {
    String value() default "noValue";
}
