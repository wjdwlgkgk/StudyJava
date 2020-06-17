package AnnotationTest;

import java.lang.reflect.Method;

public class runrun {
    public static void main(String[] args) {

        /*Method  methods[] = new Annotation_test().getClass().getDeclaredMethods();

        for(int i = 0 ; i < methods.length; i++){
            String methodsName = methods[i].getName();
            System.out.println(methodsName);
            if(methods[i].isAnnotationPresent(MyAnnotation.class) && methodsName.startsWith("do")){
                methods[i].getDeclaredAnnotations();
            }
        }*/


        AnnotationHandler annotationHandler = new AnnotationHandler();

        AnnotationExam01 exam01 = annotationHandler.getInstance(AnnotationExam01.class, InsertIntData.class).map(o -> (AnnotationExam01)o).orElse(new AnnotationExam01());
        AnnotationExam02 exam02 = annotationHandler.getInstance(AnnotationExam02.class, InsertStringData.class).map(o -> (AnnotationExam02)o).orElse(new AnnotationExam02());

        System.out.println(exam01.getMyAge());
        System.out.println(exam01.getDefaultAge());

        System.out.println(exam02.getMyData());
        System.out.println(exam02.getDefaultData());

//        AnnotationExam01 annotationExam01 = new AnnotationExam01();

//        System.out.println(annotationExam01.getDefaultAge());
//        System.out.println(annotationExam01.getMyAge());
////        System.out.println(annotationExam011.getDefaultAge());
////        System.out.println(annotationExam011.getMyAge());
//
//
//        AnnotationExam02 annotationExam02 = new AnnotationExam02();
//        System.out.println(annotationExam02.getDefaultData());
//        System.out.println(annotationExam02.getMyData());




    }
}
